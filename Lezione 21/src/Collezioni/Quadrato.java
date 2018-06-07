package Collezioni;

public class Quadrato implements PoligonoInterface
{
	private double lato;
	
	public Quadrato(double lato)
	{
		this.lato=lato;
	}
	
	public double perimetro()
	{
		return getLato()*4;
	}
	public double area()
	{
		return getLato()*getLato();	
	}

	public double getLato() {
		return lato;
	}
}
