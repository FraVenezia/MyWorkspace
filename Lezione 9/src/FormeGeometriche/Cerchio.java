package FormeGeometriche;

public class Cerchio 
{
	private double raggio;
	private final double PI_GRECO=3.14;
	
	public Cerchio(double raggio)
	{
		this.setRaggio(raggio);
	}

	public void setRaggio(double raggio) 
	{
		this.raggio = raggio;
	}
	
	public double getRaggio()
	{
		return raggio;
	}
	
	public double Circonferenza() 
	{
		return ((2*raggio)*PI_GRECO);
	}
	
	public double Area() 
	{
		return (PI_GRECO*(raggio*raggio));
	}

}
