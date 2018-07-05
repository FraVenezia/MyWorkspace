package it.begear.bookingrestapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonIgnore
	private int iDUser;
	@NotNull
	private String nome;
	@NotNull
	private String cognome;
	@NotNull
	private String email;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getiDUser() {
		return iDUser;
	}

	public void setiDUser(int iDUser) {
		this.iDUser = iDUser;
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
