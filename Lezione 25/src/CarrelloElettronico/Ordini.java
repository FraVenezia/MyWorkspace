package CarrelloElettronico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ordini 
{
	public static void main(String[] args) 
	{
		int scelta,scelta1;
		String scelta3;
		
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
			Scanner in=new Scanner(System.in);
			System.out.println("--------------Benvenuto nell'eCommerce di Acquista.it--------------");
			System.out.println("Come vogliamo procedere? ");
			System.out.println("1. Inserisci prodotti nel carrello");
			System.out.println("2. Rimuovi prodotti nel carrello");
			System.out.println("3. Visualizza carrello");
			System.out.println("4. Per uscire");
			scelta=in.nextInt();
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
							scelta1=in.nextInt();
							if(scelta1!=4)
							{
								switch(scelta1)
								{
									case 1:
									{
										for(Articolo tmp:articoli)
											if(tmp instanceof Gioco)
												System.out.println(tmp.toString());
										in=new Scanner(System.in);
										System.out.println("Che prodotto inseriamo nel carrello? (Scrivi l'ID del prodotto o \"esci\" per tornare indietro)");
										scelta3=in.nextLine();
										if(scelta3!="esci")
											for(Articolo tmp:articoli)
												if(tmp instanceof Gioco)
													if(scelta3.equals(tmp.getIdProd()))
														carrello.add(new Gioco(tmp.getIdProd(),tmp.getNomeProd(),((Gioco) tmp).getTipoConsole(),tmp.getPrezzoProd()));
										break;
									}
									case 2:
									{
										for(Articolo tmp:articoli)
											if(tmp instanceof Libro)
												System.out.println(tmp.toString());
										in=new Scanner(System.in);
										System.out.println("Che prodotto inseriamo nel carrello? (Scrivi l'ID del prodotto o \"esci\" per tornare indietro)");
										scelta3=in.nextLine();
										if(scelta3!="esci")
											for(Articolo tmp:articoli)
												if(tmp instanceof Libro)
													if(scelta3.equals(tmp.getIdProd()))
														carrello.add(new Libro(tmp.getIdProd(),tmp.getNomeProd(),((Libro) tmp).getAutore(),tmp.getPrezzoProd()));
										break;
									}
									case 3:
									{
										for(Articolo tmp:articoli)
											if(tmp instanceof Console)
												System.out.println(tmp.toString());
										in=new Scanner(System.in);
										System.out.println("Che prodotto inseriamo nel carrello? (Scrivi l'ID del prodotto o \"esci\" per tornare indietro)");
										scelta3=in.nextLine();
										if(scelta3!="esci")
											for(Articolo tmp:articoli)
												if(tmp instanceof Console)
													if(scelta3.equals(tmp.getIdProd()))
														carrello.add(new Console(tmp.getIdProd(),tmp.getNomeProd(),tmp.getPrezzoProd()));
										break;
									}
									default:
									{
										System.out.println("Scelta errata.Inserisci nuova scelta");
										break;
									}
								}
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
								for(Articolo tmp:carrello)
									System.out.println(tmp.toString());
								in=new Scanner(System.in);
								System.out.println("Inserisci l'ID del prodotto da rimuovere. \"esci\" per tornare indietro");
								scelta3=in.nextLine();
								if(!(scelta3.equals("esci")))
								{
									Iterator<Articolo> iterator=carrello.iterator();
									while(iterator.hasNext())
									{
										if(iterator.next().getIdProd().equals(scelta3))
										{
											iterator.remove();
											System.out.println("Rimozione correttamente eseguita....");
											break;
										}
									}
								}
							}
						}
						while(!(scelta3.equals("esci")));
							
						break;			
					}
					case 3:
					{
						if(carrello.isEmpty())
							System.out.println("Carrello vuoto.Niente da visualizzare");
						else
						{
							double somma=0;
							System.out.println("Questo è il tuo carrello: ");
							for(Articolo tmp:carrello)
							{
								System.out.println(tmp.toString());
								somma+=tmp.getPrezzoProd();
							}
							System.out.println("Se acquisti ora pagherai: "+somma+"€");
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
