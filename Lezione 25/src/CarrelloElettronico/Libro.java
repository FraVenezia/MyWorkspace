package CarrelloElettronico;

public class Libro extends Articolo
{
	private String autore;
	public Libro(String idProd, String nomeProd, String autore, double prezzoProd) 
	{
		super(idProd, nomeProd, prezzoProd);
		this.autore=autore;
	}
	
	@Override
	public String toString()
	{
		return "ID Prodotto:"+super.getIdProd()+" Nome Libro:"+super.getNomeProd()+" Autore:"+autore+" Prezzo:"+super.getPrezzoProd();
	}

	public String getAutore() {
		return autore;
	}
	

}
