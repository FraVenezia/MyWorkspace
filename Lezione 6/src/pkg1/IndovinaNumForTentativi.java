package pkg1;

import java.util.Scanner;

public class IndovinaNumForTentativi 
{

	public static void main(String[] args) 
	{
		int numCasuale=(int) (Math.random()*10);
		int numInserito=0;
		System.out.println("Ricorda hai solo 3 tentativi");
		int tentativi=3;
		
		for(int i=0;i<3;i++)
		{
			System.out.print("Che numero sto pensando? ");
			Scanner in=new Scanner(System.in);
			numInserito=in.nextInt();
			
			if (numCasuale!=numInserito)
				System.out.println("Sbagliato!Ti restano "+ --tentativi + " tentativi");
			else
			{
				System.out.println("Complimenti hai indovinato!!");
				break;
			}
		}
		
     }
}


