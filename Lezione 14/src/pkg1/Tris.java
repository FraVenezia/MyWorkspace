package pkg1;

import java.util.Scanner;

public class Tris 
{
	public static void main(String[] args) 
	{
		String giocatore1;
		int vincitore=0;
		String[][] tris={{"0","1","2"},{"3","4","5"},{"6","7","8"}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(tris[i][j]);
		System.out.println("");
		}
		
		while(vincitore==0)
		{

		Scanner in=new Scanner(System.in);
		System.out.println("Giocatore O:Cordinata: ");
		giocatore1=in.nextLine();
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				if(giocatore1.equals(tris[i][j]))
					tris[i][j]="O";	
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(tris[i][j]);
		System.out.println("");
		}
				
		in=new Scanner(System.in);
		System.out.println("Giocatore 1:Cordinata: ");
		giocatore1=in.nextLine();
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				if(giocatore1.equals(tris[i][j]))
					tris[i][j]="X";
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(tris[i][j]);
		System.out.println("");
		}
		
		if(tris[0][0].equals("O")&tris[0][1].equals("O")&tris[0][2].equals("O"))
		{
			System.out.println("Ha vinto lo O");
		     vincitore=1;
		}
		if(tris[1][0].equals("O")&tris[1][1].equals("O")&tris[1][2].equals("O"))
		{
			System.out.println("Ha vinto lo O");
		   vincitore=1;
		}
		if(tris[2][0].equals("O")&tris[2][1].equals("O")&tris[2][2].equals("O"))
		{
			System.out.println("Ha vinto lo O");
		   vincitore=1;
		}
		if(tris[0][0].equals("O")&tris[1][0].equals("O")&tris[2][0].equals("O"))
		{
			System.out.println("Ha vinto lo O");
		   vincitore=1;
		}
		if(tris[0][1].equals("O")&tris[1][1].equals("O")&tris[2][1].equals("O"))
		{
			System.out.println("Ha vinto lo O");
		   vincitore=1;
		}
		if(tris[0][2].equals("O")&tris[1][2].equals("O")&tris[2][2].equals("O"))
		{
			System.out.println("Ha vinto lo O");
		   vincitore=1;
		}
		if(tris[0][0].equals("O")&tris[1][1].equals("O")&tris[2][2].equals("O"))
		{
			System.out.println("Ha vinto lo O");
		    vincitore=1;
		}
		if(tris[0][2].equals("O")&tris[1][1].equals("O")&tris[2][0].equals("O"))
		{
			System.out.println("Ha vinto lo O");
		    vincitore=1;
		}
		
		
		
		if(tris[0][0].equals("X")&tris[0][1].equals("X")&tris[0][2].equals("X"))
		{
			System.out.println("Ha vinto lo O");
		     vincitore=1;
		}
		if(tris[1][0].equals("X")&tris[1][1].equals("X")&tris[1][2].equals("X"))
		{
			System.out.println("Ha vinto lo O");
		   vincitore=1;
		}
		if(tris[2][0].equals("X")&tris[2][1].equals("X")&tris[2][2].equals("X"))
		{
			System.out.println("Ha vinto lo O");
		   vincitore=1;
		}
		if(tris[0][0].equals("X")&tris[1][0].equals("X")&tris[2][0].equals("X"))
		{
			System.out.println("Ha vinto lo O");
		   vincitore=1;
		}
		if(tris[0][1].equals("X")&tris[1][1].equals("X")&tris[2][1].equals("X"))
		{
			System.out.println("Ha vinto lo O");
		   vincitore=1;
		}
		if(tris[0][2].equals("X")&tris[1][2].equals("X")&tris[2][2].equals("X"))
		{
			System.out.println("Ha vinto lo O");
		   vincitore=1;
		}
		if(tris[0][0].equals("X")&tris[1][1].equals("X")&tris[2][2].equals("X"))
		{
			System.out.println("Ha vinto lo O");
		    vincitore=1;
		}
		if(tris[0][2].equals("X")&tris[1][1].equals("X")&tris[2][0].equals("X"))
		{
			System.out.println("Ha vinto lo O");
		    vincitore=1;
		}
		
		
		
		}
	}
}

