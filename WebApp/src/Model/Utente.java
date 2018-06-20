package Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Utente")
public class Utente {
	
	private int id;
	private String nome;
	private String cognome;
	private String compleanno;
	private Login login;
	
	public Utente(String nome,String cognome,String compleanno) {
		this.nome=nome;
		this.cognome=cognome;
		this.compleanno=compleanno;
	}
	
	public Utente() {}
	
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	@OneToOne(fetch=FetchType.LAZY,mappedBy="Utente", cascade = CascadeType.ALL)
	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
}
