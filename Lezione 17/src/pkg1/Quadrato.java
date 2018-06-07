package pkg1;

public class Quadrato implements Potenza
{
	@Override
	public int potenza(int num) 
	{
		return (int) Math.pow(num, 2);	
	}

}
