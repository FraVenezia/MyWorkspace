package pkg1;
import java.util.Scanner;

public class Calcolatrice 
{
	public static void main(String[] args) 
	{
		int scelta=0;
		
		while(scelta!=5)
		{
			System.out.println("-------------------------Benvenuto!------------------------------");
			System.out.println("-------------Seleziona l'operazione da eseguire------------------");
			System.out.println("1.Somma");
			System.out.println("2.Sottrazione");
			System.out.println("3.Moltiplicazione");
			System.out.println("4.Divisione");
			System.out.println("5.Esci");
			System.out.println("-----------------------------------------------------------------");
			System.out.print("Seleziona l'operazione che vuoi eseguire: ");
			Scanner in=new Scanner(System.in);
			scelta=in.nextInt();
			
			if(scelta>=1 & scelta<=4)
			{
				System.out.print("Inserisci il primo valore: ");
				in=new Scanner(System.in);
				float num1=in.nextFloat();
				
				System.out.print("Inserisci il secondo valore: ");
				in=new Scanner(System.in);
				float num2=in.nextFloat();
				
				if(scelta==1)
					System.out.println("La somma tra i due numeri è: "+ (num1+num2));
				if(scelta==2)
					System.out.println("La sottrazione tra i due numeri è: "+ (num1-num2));
				if(scelta==3)
					System.out.println("La moltiplicazione tra i due numeri è: "+ (num1*num2));
				if(scelta==4)
					if(num2==0)
						System.out.println("La divisione per 0 non è possibile");
					else
						System.out.println("La divisione tra i due numeri è: "+ (num1/num2));
			}
			if(scelta<=0 || scelta>=6)
				System.out.println("Scelta sbagliata.Riprova");		
		}
		
		System.out.println("Arrivederci!");
	}

}
