package pkg2;

public class EserciziMod4i 
{
	public static void main(String[] args) 
	{
		String con="Numero multiplo di 3 = ";
		int numDivisibili=1;
		int i=1;
		
		while(numDivisibili!=11)
		{
			if(i%3==0)
			{
				System.out.println(con+i);
				numDivisibili++;
			}
			i++;
		}
		
	}

}
