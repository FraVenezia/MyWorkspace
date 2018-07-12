package it.begear.bookingrestapi.models;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="iDUser", scope = Customer.class)
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iDUser;
	@NotNull
	private String nome;
	@NotNull
	private String cognome;
	@NotNull
	private String email;
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Booking> bookings;

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
	@JsonIgnore
	public Set<Booking> getBooking() {
		return bookings;
	}
	public void setBooking(Set<Booking> bookings) {
		this.bookings = bookings;
	}

}
