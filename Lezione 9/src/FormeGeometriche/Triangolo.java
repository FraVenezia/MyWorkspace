package FormeGeometriche;

public class Triangolo 
{
	private int base;
	private int altezza;
	private int lato1;
	private int lato2;
	
	public int getBase() 
	{
		return base;
	}
	
	public void setBase(int base) 
	{
		this.base = base;
	}
	
	public int getAltezza() 
	{
		return altezza;
	}
	
	public void setAltezza(int altezza) 
	{
		this.altezza = altezza;
	}
	
	public int getLato1()
	{
		return lato1;
	}
	
	public void setLato1(int lato1) 
	{
		this.lato1 = lato1;
	}
	
	public int getLato2() 
	{
		return lato2;
	}
	
	public void setLato2(int lato2) 
	{
		this.lato2 = lato2;
	}
	
	public double Area()
	{
		return ((base*altezza)/2);
	}

	public int Perimetro() 
	{
		return base+lato1+lato2;
	}
	
}
