package Studenti;
public class StudenteLavoratore extends Studente
{
	private String professione;
	public StudenteLavoratore(String nome,String professione) 
	{
		super(nome);
		this.professione=professione;
	}
	
	public void setProfessione(String professione) {
		this.professione=professione;
	}
	public String getProfessione() {
		return professione;
	}

}
