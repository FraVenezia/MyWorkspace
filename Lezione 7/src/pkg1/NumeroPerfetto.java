package pkg1;

import java.util.Scanner;

public class NumeroPerfetto 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Dammi il numero che vuoi controllare: ");
		int num=in.nextInt();
		int somma=0;

		for(int i=1;i<=(num-1);i++)
		{
			if(num%i==0)
				somma+=i;
		}
		 
		if(somma==num)
			 System.out.println("il numero è perfetto");
		else
			 System.out.println("Il numero non è perfetto");
	}
}
