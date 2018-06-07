package Negozio;

public class NonAlimentari extends Prodotti
{
	private String materiale;
	
	public NonAlimentari(int codice,String descrizione,double prezzo,String materiale) {
		super(codice,descrizione,prezzo);
		this.setMateriale(materiale);
	}

	public String getMateriale()
	{
		return materiale;
	}

	public void setMateriale(String materiale) 
	{
		this.materiale = materiale;
	}
	
	public double applicaSconto() 
	{
		if(getMateriale().equals("carta") | getMateriale().equals("vetro") | getMateriale().equals("plastica"))
			return (getPrezzo()-(getPrezzo()*10)/100);
		else
	    		return super.applicaSconto();
		
	}	

}
