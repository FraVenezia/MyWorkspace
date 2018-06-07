package pkg1;
import java.util.Scanner;
public class Occorrenze
{

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Quante stringhe vuoi inserire? ");
		int ind=in.nextInt();
		
		String[] array=new String[ind];
		int contatore=0;
		
		for(int i=0;i<ind;i++)
		{
			in=new Scanner (System. in);
			System.out.println("Inserisci la " + (i+1) + "° stringa");
			array[i]=in.nextLine();
			
			for(int j=0;j<array[i].length();j++)
				if(array[i].charAt(j)=='a' | array[i].charAt(j)=='A')
					contatore++;	
		}

		System.out.println("La lettera a compare " + contatore + " volte nelle stringhe inserite");
	}

}
