package pkg1;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Inserisci il numero: ");
		int num=in.nextInt();
		
		Potenza quad=new Quadrato();
		Potenza cub=new Cubo();
		
		System.out.println("Il quadrato del numero è: "+quad.potenza(num));
		System.out.println("Il cubo del numero è: "+cub.potenza(num));
	}
}
