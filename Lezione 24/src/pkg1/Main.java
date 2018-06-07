package pkg1;

public class Main 
{

	public static void main(String[] args) throws MiaEccezione 
	{
		int i=0;
		try
		{
		if(i==0)
		throw new MiaEccezione();
		}
		catch(MiaEccezione exp)
		{
			System.out.println(exp.toString());
		}
	}

}
