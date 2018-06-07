package pkg3;

public class ContoBancario 
{
	private String contoBancario="5000000 di Euro";
	private int codice=1234;
	private int codiceInserito;
	
	public int getCodiceInserito()
	{
		return codiceInserito;
	}
	
	public void setCodiceInserito(int codiceInserito)
	{
		this.codiceInserito=codiceInserito;
		
	}
	
	public String getContoBancario()
	{
		if(codiceInserito==codice)
			return contoBancario;
		else
			return "Codice Errato!";
	}

}
