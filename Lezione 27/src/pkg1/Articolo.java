package pkg1;


public abstract class Articolo implements Comparable<Articolo>
{
	private String idProd;
	private String nomeProd;
	private double prezzoProd;
	
	public Articolo(String idProd,String nomeProd,double prezzoProd)
	{
		this.idProd=idProd;
		this.nomeProd=nomeProd;
		this.prezzoProd=prezzoProd;
	}
	
	@Override
	public abstract String toString();

	public String getIdProd() {
		return idProd;
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public double getPrezzoProd() {
		return prezzoProd;
	}
	
}
