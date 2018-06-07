package pkg1;

public class Triangolo implements PoligonoInterface{
	private double altezza;
	private double base;
	private double lato1;
	private double lato2;
	
	public double perimetro()
	{
		return getBase()*getAltezza();
	}
	
	public double area()
	{
		return getBase()+getLato1()+getLato2();
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLato1() {
		return lato1;
	}

	public void setLato1(double lato1) {
		this.lato1 = lato1;
	}

	public double getLato2() {
		return lato2;
	}

	public void setLato2(double lato2) {
		this.lato2 = lato2;
	}

}
