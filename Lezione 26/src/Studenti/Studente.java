package Studenti;
public class Studente 
{
	private String nome;
	private boolean fuoricorso;
	
	public Studente(String nome)
	{
		this.nome=nome;
		fuoricorso=false;
	}

	public boolean isFuoricorso() {
		return fuoricorso;
	}

	public void setFuoricorso(boolean fuoricorso) {
		this.fuoricorso = fuoricorso;
	}

	public String getNome() {
		return nome;
	}

	
}
