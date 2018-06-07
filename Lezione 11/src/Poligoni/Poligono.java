package Poligoni;

public abstract class Poligono 
{
	private double lato1;
	private double lato2;
	private double lato3;
	
	public Poligono(double lato1) 
	{
		this.lato1=lato1;
	}
	
	public Poligono(double lato1,double lato2) 
	{
		this.lato1=lato1;
		this.lato2=lato2;
	}
	public Poligono(double lato1,double lato2,double lato3) 
	{
		this.lato1=lato1;
		this.lato2=lato2;
		this.lato3=lato3;
	}
	
	public abstract double perimetro();
	
	public abstract double area();
	
	public double getLato1() {
		return lato1;
	}
	public double getLato2() {
		return lato2;
	}
	public double getLato3() {
		return lato3;
	}
}
