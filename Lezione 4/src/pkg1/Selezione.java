package pkg1;
import java.util.Scanner;
public class Selezione {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Inserisci il primo valore: ");
		int a=in.nextInt();
		
		in=new Scanner(System.in);
		System.out.println("Inserisci il secondo valore: ");
		int b=in.nextInt();
		
		System.out.println("-------------------------------------------------");
		System.out.println("1. Fai la somma");
		System.out.println("2. Fai la sottrazione");
		System.out.println("-------------------------------------------------");
		in=new Scanner(System.in);
		System.out.print("Inserisci la tua scelta: ");
		int scelta=in.nextInt();
		
		if (scelta==1)
			System.out.println("La somma tra i due numeri è: " + (a+b));
		if (scelta==2)
			System.out.println("La sottrazione tra i due numeri è: " + (a-b));
	}

}
