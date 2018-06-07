package pkg2;

public class EserciziMod4h 
{

	public static void main(String[] args) 
	{
		String con="Numero multiplo di 3 = ";
		int numDivisibili=0;
		
		for(int i=1;i<=100;i++)
		{
			if (numDivisibili==10)
				break;
			if(i%3==0)
			{
				System.out.println(con+i);
				numDivisibili++;
			}
		}
		
	}
}
