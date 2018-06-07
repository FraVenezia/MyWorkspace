package pkg3;

public class Modulo4a 
{
	public static void main(String[] args) 
	{
		int i=0;
		int cont=0;
		
		for(;true;)
		{
			
			if(i%2==0)
			{
				System.out.println("I numeri pari sono: "+ i);
			    cont++;
			    i++;
			    continue;
			}
			
			i++;
			
			if(cont==5)
				break;

		}
	}
}
