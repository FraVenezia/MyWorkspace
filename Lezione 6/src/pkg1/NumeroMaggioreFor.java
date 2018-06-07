package pkg1;
import java.util.Scanner;
public class NumeroMaggioreFor 
{
	public static void main(String[] args) 
	{
		int a=0;
		
		Scanner in=new Scanner(System.in);
		System.out.print("Inserisci il primo numero: ");
		int n1=in.nextInt();
		
		in=new Scanner(System.in);
		System.out.print("Inserisci il secondo numero: ");
		int n2=in.nextInt();
		
		in=new Scanner(System.in);
		System.out.print("Inserisci il terzo numero: ");
		int n3=in.nextInt();
		
		in=new Scanner(System.in);
		System.out.print("Inserisci il quarto numero: ");
		int n4=in.nextInt();
		
		in=new Scanner(System.in);
		System.out.print("Inserisci il quinto numero: ");
		int n5=in.nextInt();
		
		System.out.print("Ecco i numeri ordinati in ordine crescente: ");
		
		for(int i=0;i<=4;i++)
		{
			if(n1>a)
				a=n1;
			if(n2>a)
				a=n2;
			if(n3>a)
				a=n3;
			if(n4>a)
				a=n4;
			if(n5>a)
				a=n5;
			
			System.out.print(a+" ");
			
			if (a==n1)
				n1=0;
			if (a==n2)
				n2=0;
			if (a==n3)
				n3=0;
			if (a==n4)
				n4=0;
			if (a==n5)
				n5=0;
			a=0;
		}
		
	}
}
