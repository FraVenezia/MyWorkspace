package pkg1;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		PoligonoInterface ret=new Rettangolo();
		Scanner in=new Scanner(System.in);
		System.out.println("Inserisci la base: ");
		((Rettangolo)ret).setBase(in.nextDouble());
		System.out.println("Inserisci l'altezza: ");
		((Rettangolo)ret).setAltezza(in.nextDouble());
		System.out.println("Il perimetro di questo rettangolo è: "+stampaPerimetro(ret)+" e l'area è "+stampaPerimetro(ret));
		
		PoligonoInterface quad=new Quadrato();
		System.out.println("Inserisci il lato:");
		in=new Scanner(System.in);
		((Quadrato)quad).setLato(in.nextDouble());
		System.out.println("Il perimetro di questo quadrato è: "+stampaPerimetro(quad)+" e l'area è "+stampaPerimetro(quad));
	
		PoligonoInterface tria=new Triangolo();
		in=new Scanner(System.in);
		System.out.println("Inserisci l'altezza: ");
		((Triangolo)tria).setAltezza(in.nextDouble());
		in=new Scanner(System.in);
		System.out.println("Inserisci la base: ");
		((Triangolo)tria).setBase(in.nextDouble());
		in=new Scanner(System.in);
		System.out.println("Inserisci il primo lato: ");
		((Triangolo)tria).setLato1(in.nextDouble());
		in=new Scanner(System.in);
		System.out.println("Inserisci il secondo lato: ");
		((Triangolo)tria).setLato2(in.nextInt());
		System.out.println("Il perimetro di questo tringolo è: "+stampaPerimetro(tria)+" e l'area è "+stampaPerimetro(tria));
}
		private static double stampaPerimetro(PoligonoInterface pol)
		{
			return pol.area();
		}
		
		private static double stampaArea(PoligonoInterface pol)
		{
			return pol.perimetro();
		}
		
	
	

}
