package it.begear.OneToMany;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "utente")
public class Utente {
	
	@Id
	@Column(name="id_utente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id_utente;
	
	private String nome;
	private String cognome;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="utente")
	private Set<Documento> documenti;
	
	public Set<Documento> getDocumenti() {
		return documenti;
	}
	public void setDocumenti(Set<Documento> documenti) {
		this.documenti = documenti;
	}
	public int getId_utente() {
		return id_utente;
	}
	public void setId_utente(int id_utente) {
		this.id_utente = id_utente;
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

}
