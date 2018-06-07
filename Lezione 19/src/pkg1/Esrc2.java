package pkg1;

public class Esrc2 
{
	public static void main(String[] args) 
	{
		String s=null;
		try
		{
		int l=s.length();
		}
		
		catch(NullPointerException exc)
		{
			System.out.println("Stringa iniziallizata null");
		}
	}

}
