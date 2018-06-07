package pkg1;

public class StampaNumPari 
{

	public static void main(String[] args) 
	{
		int i;
		
		for(i=1;i<=20;i++)
		{
			if(i%2!=0)
				continue;
			System.out.println("I numeri pari sono: "+ i);
		}
		
    }
}
