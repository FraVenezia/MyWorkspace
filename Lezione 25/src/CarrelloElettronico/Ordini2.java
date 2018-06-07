package CarrelloElettronico;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ordini2 
{
	public static void main(String[] args) 
	{
		int scelta,scelta1;
		String scelta2;
		
		List<Articolo> articoli=new ArrayList<>();
		List<Articolo> carrello=new LinkedList<>();

		articoli.add(new Gioco("GGOW","God of War","PS4",69.90));
		articoli.add(new Gioco("GF18","Fifa 2018","XBox One", 59));
		articoli.add(new Gioco("GSM","Super Mario","Nintendo Switch",49.90));
		articoli.add(new Libro("LO","Origins","Dan Brown",24));
		articoli.add(new Libro("LLBDM","La biblioteca dei morti","Glenn Cooper",15.90));
		articoli.add(new Libro("LGOT","Games of Thrones","George R.R. Martin",12));
		articoli.add(new Console("CPS4","Play Station 4 Pro",399));
		articoli.add(new Console("CXBOXO","Xbox One",350));
		articoli.add(new Console("CNS","Nintendo Switch",299.99));
		
		do
		{
			scelta=0;
			scelta1=0;
			Scanner in=new Scanner(System.in);
			System.out.println("--------------Benvenuto nell'eCommerce di Acquista.it--------------");
			System.out.println("Come vogliamo procedere? ");
			System.out.println("1. Inserisci prodotti nel carrello");
			System.out.println("2. Rimuovi prodotti nel carrello");
			System.out.println("3. Visualizza carrello");
			System.out.println("4. Per uscire");
			try
			{
				scelta=in.nextInt();
			}
			catch (InputMismatchException exc)
			{
				System.out.println("Caratteri non consentiti");
			}
			if(scelta!=4)
			{
				switch (scelta)
				{
					case 1:
					{
						do
						{
							in=new Scanner(System.in);
							System.out.println("Cosa vuoi inserire nel carrello? ");
							System.out.println("1.Giochi");
							System.out.println("2.Libri");
							System.out.println("3.Console");
							System.out.println("4.Fine Inserimento");
							try
							{
								scelta1=in.nextInt();
								if(scelta1!=4)
								{
										GestioneListe.scorriLista(articoli, scelta1);
										in=new Scanner(System.in);
										System.out.println("Che prodotto inseriamo nel carrello? (Scrivi l'ID del prodotto o \"esci\" per tornare indietro)");
										GestioneListe.riempiCarrello(articoli, carrello, scelta1, in.nextLine().toUpperCase());
										System.out.println("Prodotto inserito correttamente.");
								}
							}
							catch (InputMismatchException exp)
							{
								System.out.println("Caratteri non consentiti");
							}
							catch (CustomExceptions exp)
							{
								System.out.println(exp.sceltaErrata());
							}
						}
						while(scelta1!=4);
						
						break;
					}
					case 2:
					{
						do
						{
							if(carrello.isEmpty())
							{
								System.out.println("Carrello vuoto.Niente da visualizzare");
								break;
							}
							else
							{
								System.out.println("Lista prodotti nel carrello:");
								GestioneListe.scorriLista(carrello);
								in=new Scanner(System.in);
								System.out.println("Inserisci l'ID del prodotto da rimuovere. \"esci\" per tornare indietro");
								scelta2=in.nextLine().toUpperCase();
								if(!(scelta2.equals("ESCI")))
								{
									try
									{
									GestioneListe.cancellaLista(carrello, scelta2);
									}
									catch(CustomExceptions exp)
									{
										System.out.println(exp.sceltaErrata());
									}
								}
							}
						}
						while(!(scelta2.equals("ESCI")));
							
						break;			
					}
					case 3:
					{
						if(carrello.isEmpty())
							System.out.println("Carrello vuoto.Niente da visualizzare");
						else
						{
							System.out.println("Questo è il tuo carrello: ");
							GestioneListe.scorriLista(carrello);
						}
						break;
					}
					default:
					{
						System.out.println("Scelta errata.Inserisci nuova scelta");
					}
				}
			}
		}
		while(scelta!=4);
	}
}
