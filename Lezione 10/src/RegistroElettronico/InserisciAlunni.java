package RegistroElettronico;

import java.util.Scanner;

public class InserisciAlunni 
{
	private final static String[] MATERIE={"Italiano","Matematica","Informatica","Sistemi","Elettrotecnica","Ed.Fisica"};
	private String nomeAlunno;
	private int[] voti= new int[MATERIE.length];
	private static int numAlunno;
	private double media;
	private int numAlunniClasse;
	
	public InserisciAlunni()
	{
		this.inserisci();
	}
	
	public void inserisci()
	{
		numAlunno++;
		System.out.println("Inserisci il nome del "+numAlunno+" alunno: ");
		Scanner in=new Scanner(System.in);
		nomeAlunno=in.nextLine();
	
		for (int i=0;i<MATERIE.length;i++)
		{
			System.out.println("Inserisci il voto per "+MATERIE[i]+":");
		     voti[i]=in.nextInt();
		     in=new Scanner(System.in);
		     media+=voti[i];
		}
		media/=MATERIE.length;
	}
	
	public int[] getVoti() 
	{
		return voti;
	}
	
	public String getNomeAlunno() 
	{
		return nomeAlunno;
	}
	
	public static String[] getMaterie() 
	{
		return MATERIE;
	}
	
	public double getMedia() 
	{
		return media;
	}
}
