package it.begear.ufficio.model;

import java.util.logging.Level;

import it.begear.ufficio.util.MioLog;

public class Impiegato 
{
	private int id_Imp;
	private String nome;
	private String cognome;
	private String dipartimento;
	private int ufficio;
	private int stipendio;
	
	public Impiegato(int id_Imp,String nome,String cognome,String dipartimento,int ufficio,int stipendio)
	{
		super();
		MioLog.getIstanzaMioLogger().log(Level.INFO,"Impiegato Creato");
		this.id_Imp=id_Imp;
		this.nome=nome;
		this.cognome=cognome;
		this.dipartimento=dipartimento;
		this.ufficio=ufficio;
		this.stipendio=stipendio;
	}

	public int getId_Imp() {
		return id_Imp;
	}

	public void setId_Imp(int id_Imp) {
		this.id_Imp = id_Imp;
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

	public String getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(String dipartimento) {
		this.dipartimento = dipartimento;
	}

	public int getUfficio() {
		return ufficio;
	}

	public void setUfficio(int ufficio) {
		this.ufficio = ufficio;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return "Impiegato [id_Imp=" + id_Imp + ", nome=" + nome + ", cognome=" + cognome + ", dipartimento="
				+ dipartimento + ", ufficio=" + ufficio + ", stipendio=" + stipendio + "]";
	}
}
