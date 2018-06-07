package CarrelloElettronico;

public class Gioco extends Articolo 
{
	private String tipoConsole;
	public Gioco(String idProd, String nomeProd, String tipoConsole, double prezzoProd) 
	{
		super(idProd, nomeProd, prezzoProd);
		this.tipoConsole=tipoConsole;
	}
	
	@Override
	public String toString()
	{
		return "ID Prodotto:"+super.getIdProd()+" Nome Gioco:"+super.getNomeProd()+" Per Consolle:"+tipoConsole+" Prezzo:"+super.getPrezzoProd();
	}

	public String getTipoConsole() {
		return tipoConsole;
	}

}
