package Poligoni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
			Scanner in=new Scanner(System.in);
			System.out.println("Scegli la forma geometrica: ");
			System.out.println("1.Quadrato");
			System.out.println("2.Rettangolo");
			System.out.println("3.Triangolo");


			switch (in.nextInt())
			{
				case 1:
				{
					in=new Scanner(System.in);
				    System.out.print("Inseriscimi il lato: ");
				    Quadrato quad=new Quadrato(in.nextDouble());
					System.out.println("Il perimetro di questo quadrato è: "+quad.perimetro()+" e l'area è "+quad.area());
					break;
				}
				case 2:
				{
					in=new Scanner(System.in);
				    System.out.print("Inseriscimi la base: ");
					double lato1=in.nextInt();
					in=new Scanner(System.in);
					System.out.print("Inseriscimi l'altezza: ");
					double lato2=in.nextInt();
					Rettangolo rett=new Rettangolo(lato1,lato2);
					System.out.println("Il perimetro di questo rettangolo è: "+rett.perimetro()+" e l'area è "+rett.area());
					break;
				}
				case 3:
				{
					in=new Scanner(System.in);
					System.out.println("Inserisci l'altezza: ");
					double altezza=in.nextDouble();
					in=new Scanner(System.in);
					System.out.println("Inserisci la base: ");
					double lato1=in.nextDouble();
					in=new Scanner(System.in);
					System.out.println("Inserisci il primo lato: ");
					double lato2=in.nextDouble();
					in=new Scanner(System.in);
					System.out.println("Inserisci il secondo lato: ");
					double lato3=in.nextInt();
					Triangolo tria=new Triangolo(lato1,lato2,lato3,altezza);
					System.out.println("Il perimetro di questo tringolo è: "+tria.perimetro()+" e l'area è "+tria.area());
					break;
				}
			}
	}
}


