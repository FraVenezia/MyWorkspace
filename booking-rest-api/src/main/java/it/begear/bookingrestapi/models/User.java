package it.begear.bookingrestapi.models;

public class User {
	private String nome;
	private String cognome;
	private String email;

	public User(String nome,String cognome,String email) {
		this.nome=nome;
		this.cognome=cognome;
		this.email=email;
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
