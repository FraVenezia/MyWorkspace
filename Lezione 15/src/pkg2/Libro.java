package pkg2;

public class Libro implements Documenti 
{
	private String soggetto;
	private int costo;
	
	public Libro(String soggetto,int costo) 
	{
		this.soggetto=soggetto;
		this.costo=costo;
		
	}
	public boolean uguale(Object X) 
	{
		if(soggetto.equals(((Libro) X).getSoggetto()))
			return true;
		else
			return false;
	}

	public String getSoggetto() {
		return soggetto;
	}


	public void setSoggetto(String soggetto) {
		this.soggetto = soggetto;
	}


	public int getCosto() {
		return costo;
	}


	public void setCosto(int costo) {
		this.costo = costo;
	}	
}
