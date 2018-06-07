package pkg1;

import java.util.Scanner;

public class IndovinaNum {

	public static void main(String[] args) 
	{
	
		int numCasuale=(int) (Math.random()*10);
		int numInserito=0;
		
		do
		{
			System.out.print("Che numero sto pensando? ");
			Scanner in=new Scanner(System.in);
			numInserito=in.nextInt();
			
			if (numCasuale!=numInserito)
				System.out.println("Sbagliato!Ritenta...");
			
		}
		while (numCasuale!=numInserito);
		
	    System.out.println("Complimenti hai indovinato!!");

	}
}
