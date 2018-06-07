package pkg1;
import java.util.Scanner;
public class DivisoriDi5 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Inserisci il numero che vuoi verificare: ");
		int num=in.nextInt();
		
		for(;true;)
		{
				num-=5;
			if(num==0)
		    {
			    	System.out.println("Il numero è divisibile per 5");
			    break;
		    }
		    if(num<0)
		    {
			    	System.out.println("Il numero non è divisibile per 5");
			    break;
		    }
		}
		
	}
}