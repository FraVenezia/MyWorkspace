package pkg1;

public class MiaEccezione extends Exception 
{
	public MiaEccezione()
	{
		super("Errore Mio");
	}
	
	@Override
	public String toString()
	{
		return "Errore generico";
		
	}

}
