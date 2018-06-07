package pkg1;

import java.util.Scanner;

public class Esrc3 {

	public static void main(String[] args) 
	{
		try
		{	
			Scanner in=new Scanner(System.in);
			System.out.println("Inserisci il numero: ");
			int a=in.nextInt();
			int b= (int) (Math.random()*4);
			int c=a/b;
			System.out.println("Il risultato è: "+c);
		}
			
		catch (ArithmeticException exc)
	 	{
			System.out.println("Divisione per 0 non possibile");
		}
		catch (Exception exc)
	 	{
			System.out.println("Errore di inserimento");
		}
		
	}
}
