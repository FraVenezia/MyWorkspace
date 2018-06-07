package Poligoni2;

public class Rettangolo extends Poligono
{
	public Rettangolo(double lato1,double lato2)
	{
		super(lato1,lato2);
	}
	
	public double perimetro()
	{
		return (getLato1()+getLato2())*2;
	}
	
	public double area()
	{
		return getLato1()*getLato2();
	}

}
