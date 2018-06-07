package FormeGeometriche;

public class Rettangolo 
{
	private int base;
	private int altezza;
		
	public void setBase(int base)
	{
		this.base=base;
	}
	
	public void setAltezza(int altezza)
	{
		this.altezza=altezza;
	}
	
	public int getBase()
	{
		return base;
	}
	
	public int getAltezza()
	{
		return altezza;
	}

	public int Perimetro()
	{
		return ((base+altezza)*2);
	}
	
	public int Area()
	{
		return (base*altezza);
	}

}
