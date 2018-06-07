package CarrelloElettronico;

public class CustomExceptions extends Exception
{
	public CustomExceptions()
	{
		System.out.println("Errore d'inserimento");
	}
	
	public String sceltaErrata()
	{
		return "Scelta non gestita";	
	}

}
