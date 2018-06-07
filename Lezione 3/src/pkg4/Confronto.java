package pkg4;

import java.util.Scanner;

public class Confronto 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Inserisci il valore A: ");
		int a=in.nextInt();
		
		in=new Scanner(System.in);
		System.out.println("Inserisci il valore B: ");
		int b=in.nextInt();
		
		in=new Scanner(System.in);
		System.out.println("Inserisci il valore C: ");
		int c=in.nextInt();
		
		if (a==b & b==c)
			System.out.println("I numeri sono uguali");
		else
			if(a==b & b>c)
				System.out.println("I maggiori sono A e B");
			else
				if(a<b & b==c)
					System.out.println("I maggiori sono B e C");
				else
					if(a==c & c>b)
						System.out.println("I maggiori sono A e C");
					else
						if (a>b & a>c)
							System.out.println("Il maggiore è A");
						else
							if (b>a & b>c)
								System.out.println("Il maggiore è B");
							else
								if (c>a & c>b)
									System.out.println("Il maggiore è C");
						
			}

}
