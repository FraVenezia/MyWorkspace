package it.begear.ufficio.model;

import java.util.logging.Level;

import it.begear.ufficio.util.MioLog;

public class Dipartimento 
{
	private String nome;
	private String indirizzo;
	private String citta;
	
	public Dipartimento(String nome,String indirizzo,String citta)
	{
		super();
		MioLog.getIstanzaMioLogger().log(Level.INFO,"Dipartimento Creato");
		this.nome=nome;
		this.indirizzo=indirizzo;
		this.citta=citta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	@Override
	public String toString() {
		return "Dipartimento [nome=" + nome + ", indirizzo=" + indirizzo + ", citta=" + citta + "]";
	}	
}

