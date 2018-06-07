package pkg1;

public class Esrc1 
{

	public static void main(String[] args) 
	{
		int[] T=null;
		try
		{
		T[0]=7;
		}
		
		catch(NullPointerException exc)
		{
			System.out.println("Array inizializzato null");
		}

	}

}
