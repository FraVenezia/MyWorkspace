package pkg1;

import java.util.Scanner;

public class IndovinaNum2 {

	public static void main(String[] args) 
	{
		int numCasuale=(int) (Math.random()*10);
		
		System.out.print("Che numero sto pensando? ");
		Scanner in=new Scanner(System.in);
		int numInserito=in.nextInt();
		
		while (numCasuale!=numInserito)
		{
			if (numCasuale!=numInserito)
				System.out.println("Sbagliato!Ritenta...");
			
			System.out.print("Che numero sto pensando? ");
			in=new Scanner(System.in);
			numInserito=in.nextInt();
			
		}
		
		System.out.println("Complimenti hai indovinato!!");

	}

}
