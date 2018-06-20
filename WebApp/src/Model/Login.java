package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.Parameter;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Login")
public class Login {
	
	private String username;
	private String password;
	private int id_Utente;
	private Utente utente;

	public Login(String username,String password) {
		this.username=username;
		this.password=password;
	}
	public Login() {}
	@Id
	@Column(name = "Username")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "Password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "Utente"))
	@GeneratedValue(generator = "generator")
	public int getId_Utente() {
		return id_Utente;
	}
	public void setId_Utente(int id) {
		this.id_Utente = id;
	}
	
	@OneToOne (fetch=FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	

}
