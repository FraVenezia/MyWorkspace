package Poligoni;

public class Triangolo extends Poligono
{
	private double altezza;
	
	public Triangolo(double lato1,double lato2,double lato3,double altezza)
	{
		super(lato1,lato2,lato3);
		this.altezza=altezza;
	}
	
	public double perimetro()
	{
		return getLato1()*altezza;
	}
	
	public double area()
	{
		return getLato1()+getLato2()+getLato3();
	}

}
