package Negozio;

import java.util.Calendar;
import java.util.Scanner;

public class ListaSpesa 
{

	public static void main(String[] args) 
	{	
		System.out.println("Quanti prodotti alimentari hai in carrello?");
		Scanner in=new Scanner(System.in);
		int numProdAli=in.nextInt();
		Alimentari[] prodAlim=new Alimentari[numProdAli];
		
		for(int i=0;i<numProdAli;i++)
		{
			System.out.print("Inserisci il codice a barre del "+(i+1)+"° prodotto: ");
			in=new Scanner(System.in);
			int codBarre=in.nextInt();
			System.out.print("Inserisci la descrizione del "+(i+1)+"° prodotto: ");
			in=new Scanner(System.in);
			String descrizione=in.nextLine();
			System.out.print("Inserisci il prezzo del "+(i+1)+"° prodotto: ");
			in=new Scanner(System.in);
			double prezzo=in.nextDouble();
			System.out.println("Ora inserirai la data di scadenza.");
			System.out.print("Inserisci il giorno di scadenza del "+(i+1)+"° prodotto: ");
			in=new Scanner(System.in);
			int giorno=in.nextInt();
			System.out.print("Inserisci il mese di scadenza del "+(i+1)+"° prodotto: ");
			in=new Scanner(System.in);
			int mese=in.nextInt()-1;
			System.out.print("Inserisci l'anno di scadenza del "+(i+1)+"° prodotto: ");
			in=new Scanner(System.in);
			int anno=in.nextInt();
			prodAlim[i]=new Alimentari(codBarre,descrizione,prezzo,anno,mese,giorno);
		}
			
		System.out.println("Quanti prodotti non alimentari hai in carrello?");
		in=new Scanner(System.in);
		int numProdNonAli=in.nextInt();
		NonAlimentari[] prodNonAlim=new NonAlimentari[numProdNonAli];
		
		for(int i=0;i<numProdNonAli;i++)
		{
			System.out.print("Inserisci il codice a barre del "+(i+1)+"° prodotto: ");
			in=new Scanner(System.in);
			int codBarre=in.nextInt();
			System.out.print("Inserisci la descrizione del "+(i+1)+"° prodotto: ");
			in=new Scanner(System.in);
			String descrizione=in.nextLine();
			System.out.print("Inserisci il prezzo del "+(i+1)+"° prodotto: ");
			in=new Scanner(System.in);
			double prezzo=in.nextDouble();
			System.out.print("Inserisci il materiale del "+(i+1)+"° prodotto: ");
			in=new Scanner(System.in);
			String materiale=in.nextLine();
			
			prodNonAlim[i]=new NonAlimentari(codBarre,descrizione,prezzo,materiale);
		}
		
		double somma=0;
		System.out.println("Questa è la tua lista della spesa dopo aver applicato gli sconti: ");
		
		for(int i=0;i<numProdAli;i++)
		{	
			double prezzoScontato=prodAlim[i].applicaSconto();
			  
			System.out.println("Codice: "+prodAlim[i].getCodice()
											 +" Descrizione: "
											 +prodAlim[i].getDescrizione()
											 +" Prezzo scontato: "
											 +prezzoScontato
											 +" Data di scadenza: "
											 +prodAlim[i].getData().get(Calendar.DAY_OF_MONTH)
											 +"/"
											 +(prodAlim[i].getData().get(Calendar.MONTH)+1)
											 +"/"
											 +prodAlim[i].getData().get(Calendar.YEAR));
			somma+=prezzoScontato;
		}
		
		for(int i=0;i<numProdNonAli;i++)
		{
			double prezzoScontato=prodNonAlim[i].applicaSconto();
			
			System.out.println("Codice: "+prodNonAlim[i].getCodice()
											 +" Descrizione: "
											 +prodNonAlim[i].getDescrizione()
											 +" Prezzo scontato: "
								             +prezzoScontato
						    		             +" Materiale: "
											 +prodNonAlim[i].getMateriale());
			somma+=prezzoScontato;
		}
		
		System.out.println("La somma della tua spesa è: "+somma);
	}
}

