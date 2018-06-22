package Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Utente")
public class Utente {
	
	private String username;
	private String nome;
	private String cognome;
	private String compleanno;
	
	public Utente(String username,String nome,String cognome,String compleanno) {
		this.username=username;
		this.nome=nome;
		this.cognome=cognome;
		this.compleanno=compleanno;
	}
	
	public Utente() {}
	
	@Id
	@Column(name = "Username")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	
	public String getCompleanno() {
		return compleanno;
	}
	public void setCompleanno(String compleanno) {
		this.compleanno = compleanno;
	}
	
}
