package pkg2;

import java.util.Scanner;

public class ArrayMultidimensionale {

	public static void main(String[] args) {
		int[][][][] matrice=new int[2][2][2][2];
		Scanner in=new Scanner(System.in);
		
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
				for(int y=0;y<2;y++)
					for(int z=0;z<2;z++)	
				{
					System.out.println("Inserisci l'elemento con cordinate: "+i+"-"+j+"-"+y+"-"+z);
					matrice[i][j][y][z]=in.nextInt();
				}
		
		for(int i=0;i<2;i++)
		{
			System.out.println("");
			for(int j=0;j<2;j++)
				for(int y=0;y<2;y++)
					for(int z=0;z<2;z++)	
					System.out.print(" "+matrice[i][j][y][z]);
		}
		

	}

}
