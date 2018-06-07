package pkg1;
import java.util.Scanner;
public class Matrice {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Quale sarà la grandezza delle righe e dele colonne nella matrice? ");
		int ind=in.nextInt();
		
		int[][] matrice=new int[ind][ind];
		int somma=0;
		
		for(int i=0;i<ind;i++)
			for(int j=0;j<ind;j++)
			{
				System.out.print("Inserisci il valore: ");
				matrice[i][j]=in.nextInt();
			}
		
		for(int i=0;i<ind;i++)
		{
			for(int j=0;j<ind;j++)
				System.out.print(matrice[i][j]+" ");
			System.out.println("");
		}
		         
		for(int i = 0;i<ind;i++)
			somma+=matrice[i][i];
		
		System.out.println("La somma della diagonale è: "+somma);

	}
}
