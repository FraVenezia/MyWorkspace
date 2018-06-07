package pkg1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Esrc4 
{
	public static void main(String[] args) 
	{
		int[] array=new int[5];
		try
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Inserisci il numero che vuoi mettere nell'array");
			int a=in.nextInt();
			
			in=new Scanner(System.in);
			System.out.println("Inserisci in che posizione dell'array vuoi mettere il valore");
			int i=in.nextInt();
			
			array[i]=a;
			System.out.println("Inserimento corretto...");
		}
		catch (InputMismatchException exc)
		{
			System.out.println("Puoi  inserire solo numeri");
		}
		catch (ArrayIndexOutOfBoundsException exc)
		{
			System.out.println("Non puoi inserire il valore in una posizione inesistente");
		}
		

	}

}
