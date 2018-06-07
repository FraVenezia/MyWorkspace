package pkg6;

public class Divisione extends Stampa implements Operazioni 
{

	@Override
	public void operazioni(int a, int b) 
	{
		double n=a/b;
		stampa(n);	
	}


	@Override
	public void stampa(double n) {
		// TODO Auto-generated method stub
		
	}
}
