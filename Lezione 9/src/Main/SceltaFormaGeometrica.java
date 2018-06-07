package Main;

import java.util.Scanner;
import FormeGeometriche.*;

public class SceltaFormaGeometrica 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Scegli la forma geometrica: ");
		System.out.println("1.Quadrato");
		System.out.println("2.Rettangolo");
		System.out.println("3.Triangolo");
		System.out.println("4.Cerchio");

		switch (in.nextInt())
		{
			case 1:
			{
				in=new Scanner(System.in);
			    System.out.print("Inseriscimi il lato: ");
			    Quadrato quad=new Quadrato(in.nextInt());
				System.out.println("Il perimetro di questo quadrato è: "+quad.Perimetro()+" e l'area è "+quad.Area());
				break;
			}
			case 2:
			{
				Rettangolo rett=new Rettangolo();
				in=new Scanner(System.in);
			    System.out.print("Inseriscimi la base: ");
				rett.setBase(in.nextInt());
				in=new Scanner(System.in);
				System.out.print("Inseriscimi l'altezza: ");
				rett.setAltezza(in.nextInt());
				System.out.println("Il perimetro di questo rettangolo è: "+rett.Perimetro()+" e l'area è "+rett.Area());
				break;
			}
			case 3:
			{
				Triangolo tria=new Triangolo();
				in=new Scanner(System.in);
				System.out.println("Inserisci l'altezza: ");
				tria.setAltezza(in.nextInt());
				in=new Scanner(System.in);
				System.out.println("Inserisci la base: ");
				tria.setBase(in.nextInt());
				in=new Scanner(System.in);
				System.out.println("Inserisci lil primo lato: ");
				tria.setLato1(in.nextInt());
				in=new Scanner(System.in);
				System.out.println("Inserisci lil secondo lato: ");
				tria.setLato2(in.nextInt());
				System.out.println("Il perimetro di questo tringolo è: "+tria.Perimetro()+" e l'area è "+tria.Area());
				break;
			}
			case 4:
			{
				in=new Scanner(System.in);
			    System.out.print("Inseriscimi il raggio: ");
			    Cerchio cerch=new Cerchio(in.nextDouble());
			    System.out.println("La circonferenza di questo cerchio è: "+cerch.Circonferenza()+" e l'area è "+cerch.Area());
				break;
			}
			
			default:
				break;
		}
		
	}
}




					
