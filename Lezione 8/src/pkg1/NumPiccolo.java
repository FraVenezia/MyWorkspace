package pkg1;

import java.util.Scanner;

public class NumPiccolo 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Quanti numeri vuoi inserire? ");
		int ind=in.nextInt();
		
		int[] array=new int[ind];
		int piccolo=0;
		
		for(int i=0;i<ind;i++) 
		{
			in=new Scanner (System.in);
			System.out.println("Inserisci il " + (i+1) + "° numero");
			array[i]=in.nextInt();
			
			if(i==0) 
			{
				piccolo=array[i];
				continue;
			}
			if(array[i]<piccolo)
				piccolo=array[i];
		}

		System.out.println("Il numero più piccolo inserito è: " + piccolo);
		
	}
}
