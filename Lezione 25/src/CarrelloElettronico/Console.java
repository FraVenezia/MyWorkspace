package CarrelloElettronico;

public class Console extends Articolo 
{
	
	public Console(String idProd, String nomeProd, double prezzoProd) 
	{
		super(idProd, nomeProd, prezzoProd);
	}
	
	@Override
	public String toString()
	{
		return "ID Prodotto:"+super.getIdProd()+" Nome Console:"+super.getNomeProd()+" Prezzo:"+super.getPrezzoProd();
	}

}
