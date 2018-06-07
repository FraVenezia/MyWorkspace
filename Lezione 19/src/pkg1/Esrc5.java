package pkg1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Esrc5 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Inserisci un numero reale o un numero immaginario (preceduto dalla lettera j)");
		try
		{
			String a=in.nextLine();
			System.out.println("Inserito un numero reale");
		}
		catch(InputMismatchException exc)
		{
			System.out.println("Inserito numero immaginario");
		}
	}
}
