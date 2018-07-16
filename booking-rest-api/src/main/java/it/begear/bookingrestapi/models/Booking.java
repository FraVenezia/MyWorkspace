package it.begear.bookingrestapi.models;

import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

//@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="numbooking", scope = Booking.class)
@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numbooking;
	private Date bookingdate;
	private double pricetotal;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "IDUser")
	private Customer customer;
	@OneToMany(mappedBy = "booking", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Set<Bookingroom> bookingroom;

	public Booking() {
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

	public Set<Bookingroom> getBookingroom() {
		return bookingroom;
	}

	public void setBookingroom(Set<Bookingroom> bookingroom) {
		this.bookingroom = bookingroom;
	}


}
