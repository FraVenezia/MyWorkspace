package Poligoni;

public class Quadrato extends Poligono
{
	public Quadrato(double lato1)
	{
		super(lato1);
	}
	
	public double perimetro()
	{
		return getLato1()*4;
	}
	
	public double area()
	{
		return getLato1()*getLato1();
	}

}
