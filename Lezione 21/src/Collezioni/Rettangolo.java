package Collezioni;

public class Rettangolo implements PoligonoInterface 
{
	private double base;
	private double altezza;
	
	public Rettangolo(double base,double altezza)
	{
		this.base=base;
		this.altezza=altezza;
	}
	public double perimetro()
	{
		return ((getBase()+getAltezza())*2);
	}
	public double area()
	{
		return getBase()*getAltezza();	
	}
		
	public double getBase() {
		return base;
	}
	public double getAltezza() {
		return altezza;
	}
}
