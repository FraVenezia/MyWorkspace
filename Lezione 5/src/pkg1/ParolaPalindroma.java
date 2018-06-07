package pkg1;

import java.util.Scanner;

public class ParolaPalindroma {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Inserisci la parola: ");
		String str=in.nextLine();
		
		str=str.toLowerCase();
		
		int numLettere=str.length()-1,i=0;
		
		while (numLettere!=-1) 
		{
			if(str.charAt(i)==str.charAt(numLettere)) 
			{
				i++;
				numLettere--;
			}
			else
			{
				System.out.println("La parola non è palindroma");
			    break;
			}
		}
		
		if (i==str.length()) 
			System.out.println("La parola è palindroma");
		
	}
}
