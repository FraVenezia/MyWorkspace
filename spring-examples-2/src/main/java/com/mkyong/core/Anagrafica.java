package com.mkyong.core;

public class Anagrafica {
	private String nome;
	private String cognome;
	
	public Anagrafica(String nome,String cognome) {
		this.nome=nome;
		this.cognome=cognome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

}
