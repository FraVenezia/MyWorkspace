package Negozio;

public class Prodotti 
{
	private int codice;
	private String descrizione;
	private double prezzo;
	
	public Prodotti(int codice,String descrizione,double prezzo)
	{
		this.setCodice(codice);
		this.setDescrizione(descrizione);
		this.setPrezzo(prezzo);	
	}
	
	public double applicaSconto() 
	{
		double sconto=(prezzo*5)/100;
		return prezzo-sconto;
	}	
	
	public int getCodice() 
	{
		return codice;
	}
	
	public void setCodice(int codice) 
	{
		this.codice = codice;
	}
	
	public String getDescrizione() 
	{
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) 
	{
		this.descrizione = descrizione;
	}
	
	public double getPrezzo() 
	{
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) 
	{
		this.prezzo = prezzo;
	}

}
