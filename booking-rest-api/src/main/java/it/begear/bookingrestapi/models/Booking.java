package it.begear.bookingrestapi.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numbooking;
	@NotNull
	private Date bookingdate;
	@NotNull
	private double pricetotal;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "IDUser")
	private Customer customer;

	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public int getNumbooking() {
		return numbooking;
	}

	public void setNumbooking(int numbooking) {
		this.numbooking = numbooking;
	}

	public Date getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}

	public double getPricetotal() {
		return pricetotal;
	}

	public void setPricetotal(double pricetotal) {
		this.pricetotal = pricetotal;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Customer getUser() {
		return customer;
	}

	public void setUser(Customer customer) {
		this.customer = customer;
	}

}
