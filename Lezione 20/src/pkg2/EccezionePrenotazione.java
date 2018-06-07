package pkg2;

public class EccezionePrenotazione extends Exception 
{
	private String nome;
	public EccezionePrenotazione(String nome) 
	{
		this.nome=nome;
	}
	public String eccezioneParolacce()
	{
		return nome+" non lo puoi inserire";
	}
}
