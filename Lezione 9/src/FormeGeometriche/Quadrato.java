package FormeGeometriche;

public class Quadrato 
{
	private int lato;
	
	public Quadrato(int lato)
	{
		this.setLato(lato);
	}
	
	public void setLato(int lato)
	{
		this.lato=lato;
	}
	
	public int getLato()
	{
		return lato;
	}

	public int Perimetro()
	{
		return (lato*4);
	}
	
	public int Area()
	{
		return (lato*lato);
	}
}
