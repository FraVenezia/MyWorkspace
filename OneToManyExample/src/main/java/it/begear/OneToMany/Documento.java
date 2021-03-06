package it.begear.OneToMany;

import javax.persistence.*;

@Entity
@Table(name = "documento")
public class Documento {
	
	@Id
	@Column(name="id_documento")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_documento;
	
	private String tipo;
	private String formato;
	
	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn(name="id_utente")
	private Utente utente;
		
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public int getId_documento() {
		return id_documento;
	}
	public void setId_documento(int id_documento) {
		this.id_documento = id_documento;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	@Override
	public String toString() {
		return "Documento [id_documento=" + id_documento + ", tipo=" + tipo + ", formato=" + formato + "]";
	}
	
	

}
