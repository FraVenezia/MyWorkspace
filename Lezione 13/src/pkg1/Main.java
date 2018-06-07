package pkg1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Rettangolo ret=new Rettangolo();
		Scanner in=new Scanner(System.in);
		System.out.println("Inserisci la base: ");
		ret.setBase(in.nextDouble());
		System.out.println("Inserisci l'altezza: ");
		ret.setAltezza(in.nextDouble());
		System.out.println("Il perimetro di questo rettangolo è: "+ret.perimetro()+" e l'area è "+ret.area());
		
		Quadrato quad=new Quadrato();
		System.out.println("Inserisci il lato:");
		in=new Scanner(System.in);
		quad.setLato(in.nextDouble());
		System.out.println("Il perimetro di questo quadrato è: "+quad.perimetro()+" e l'area è "+quad.area());
	
		Triangolo tria=new Triangolo();
		in=new Scanner(System.in);
		System.out.println("Inserisci l'altezza: ");
		tria.setAltezza(in.nextDouble());
		in=new Scanner(System.in);
		System.out.println("Inserisci la base: ");
		tria.setBase(in.nextDouble());
		in=new Scanner(System.in);
		System.out.println("Inserisci il primo lato: ");
		tria.setLato1(in.nextDouble());
		in=new Scanner(System.in);
		System.out.println("Inserisci il secondo lato: ");
		tria.setLato2(in.nextInt());
		System.out.println("Il perimetro di questo tringolo è: "+tria.perimetro()+" e l'area è "+tria.area());
	}

}
