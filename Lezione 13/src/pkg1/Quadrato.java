package pkg1;

public class Quadrato implements PoligonoInterface
{
	private double lato;
	
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

	public void setLato(double lato) {
		this.lato = lato;
	}
	

}
