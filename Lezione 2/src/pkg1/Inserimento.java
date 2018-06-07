package pkg1;

import java.util.Scanner;

public class Inserimento {
	
	public int[] vettore(int[] vet){
		
		Scanner in=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {	
			System.out.println("Inserisci il valore con l'indice " + i);
			vet[i]=in.nextInt();	
		}
		
		return vet;
	}

}
