package pkg1;

public class Rettangolo implements PoligonoInterface 
{
	private double base;
	private double altezza;
	
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
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
}
