package RegistroElettronico;

import java.util.Scanner;

public class MenuSingleton 
{
	 private static MenuSingleton istanza;
	 private static int numAlunni;
	 private static InserisciAlunni[] classe; 
	 private int scelta;
	 private int controllo=0;
	 
	 public static MenuSingleton getInstance()
	 {
		 if (istanza == null)
		 {
		 	 System.out.print("Quanti alunni ci sono nella classe? ");
		 	 Scanner in=new Scanner(System.in);
		 	 numAlunni=in.nextInt();
		 	 classe=new InserisciAlunni[numAlunni]; 
		 	 istanza = new MenuSingleton();
		 }
	     return istanza;
	 }
	  
	  public int Scelta()
	  {
		  System.out.println("1.Inserimento alunni");
		  System.out.println("2.Statistiche Classe");
		  System.out.println("3.Esci e cancella il registro");
		  Scanner in=new Scanner(System.in);
		  scelta=in.nextInt();
		  
		  switch (scelta)
		  {
		  	case 1:
		  	{
		  		if(controllo==0)
		  		{
			  		for(int i=0;i<numAlunni;i++)
			  			classe[i]=new InserisciAlunni();
			  		System.out.println("Inserimento completo.");
			  		controllo=1;
		  		}
		  		else
		  			System.out.println("Già hai inserito gli alunni");
		  	}	
		  	break;
		  	case 2:
		  		StatisticheClasse dati=new StatisticheClasse();
		  		break;
		  }
		  return scelta;
	  }

	public static int getNumAlunni() 
	{
		return numAlunni;
	}

	public static InserisciAlunni[] getClasse() {
		return classe;
	}
}
