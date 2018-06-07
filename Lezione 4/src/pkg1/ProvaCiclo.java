package pkg1;

import java.util.Scanner;

public class ProvaCiclo
{

	public static void main(String[] args) 
	{
		/*
		int i=1;
		int a=0;
		
		while (i<=10) 
		{
			a+=i;
			i++;
		}
		System.out.println(a);
		
		int j=1;
		int b=0;
		while (j<=3) 
		{
			Scanner in=new Scanner(System.in);
			b+=+in.nextInt();
			j++;
		}
		System.out.println(b);
		*/
		int j=0;
		int b=0;
		int a=0;
		while (j<3) 
		{
			Scanner in=new Scanner(System.in);
			a=in.nextInt();	
			if(a%2==0)
				{
					b+=a;
					j++;
				}
				else
					j++;
		}
		System.out.println(b);
	}
}

