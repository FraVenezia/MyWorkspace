package ProvHibernate.ProvHibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "Persona")

public class Persona {
	private int iD_Pers;
	private String nome;
	private String Cognome;
	private int et�;
	
	public Persona() {}
	@Id
	@Column(name = "iD_Pers")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public int getiD_Pers() {
		return iD_Pers;
	}

	public void setiD_Pers(int iD_Pers) {
		this.iD_Pers = iD_Pers;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public int getEt�() {
		return et�;
	}

	public void setEt�(int et�) {
		this.et�= et�;
	}
	
	

}
