package pkg2;

public class GestionePrenotazioni 
{
	private String [] posti=new String[3];
	private int i=2;
	
	public String InserimentoPrenotazione(String nome) throws ArrayIndexOutOfBoundsException
	{
		posti[i]=nome;
		i--;
		return "Inserimento effettuato";	
	}
}
