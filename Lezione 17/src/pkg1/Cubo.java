package pkg1;

public class Cubo implements Potenza
{
	@Override
	public int potenza(int num) 
	{
		return (int) Math.pow(num, 3);
	}

}
