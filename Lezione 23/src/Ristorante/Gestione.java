package Ristorante;
import java.util.*;
public class Gestione 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		Menu menu=new Menu();
		Tavoli tavoli=new Tavoli();
		ArrayList <Ordinazioni>ordinazioni=new ArrayList<>();
		while(true)
		{
			System.out.println("1.Ordinare");
			System.out.println("2.Scontrino");
			switch (in.nextInt())
			{
				case 1:
				{
					System.out.println(tavoli.getTavoli());
					System.out.println("Tavolo: ");
					in=new Scanner(System.in);
					int tavolo=in.nextInt();
					Ordinazioni ord=new Ordinazioni(tavolo,tavoli.getTavoli().get(tavolo));
					ordinazioni.add(ord);
	
					String scelta="";
					int fine=0;
					System.out.println(menu.getPiatti());
					do 
					{
						in=new Scanner(System.in);
						System.out.println("Ordine Piatti: ");
						scelta=in.nextLine();
						ord.setOrdine(scelta, menu.getPiatti().get(scelta));
						System.out.println("0 per passare alle bevande");
						in=new Scanner(System.in);
						fine=in.nextInt();
					}
					while (fine!=0);
					
					do 
					{
						in=new Scanner(System.in);
						System.out.println(menu.getBevande());
						System.out.println("Ordine Bevande: ");
						scelta=in.nextLine();
						ord.setOrdine(scelta, menu.getBevande().get(scelta));	
						System.out.println("0 per mandare la comanda");
						in=new Scanner(System.in);
						fine=in.nextInt();;
					}
					while (fine!=0);
					
				}
				break;
				case 2:
				{
					in=new Scanner(System.in);
					System.out.println("Dammi il tavolo di chi vuoi lpo scontrino");
					int tavolo=in.nextInt();
					for(Ordinazioni tmp:ordinazioni)
					{
						if(tmp.getTavolo()==tavolo)
						{
							System.out.println("Lista ordine: "+tmp.getOrdine()
														      +" Persone a tavola: "
														      +tmp.getCommensali()
														      +" Conto: "+tmp.conto()
														      +" Conto con i coperti: "
														      +(tmp.conto()+(tmp.getCommensali()*2.50)));
						}
					}
					
				}
				break;
			}
		}
	}

}
