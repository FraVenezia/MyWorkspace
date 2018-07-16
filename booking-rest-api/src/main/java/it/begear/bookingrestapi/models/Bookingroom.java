package it.begear.bookingrestapi.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;


//@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="idbookingroom", scope = Bookingroom.class)
@Entity
public class Bookingroom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idbookingroom;
	private Date checkin;
	private Date checkout;
	private double price;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "Numbooking")
	private Booking booking;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "IDRoom")
	private Room room;

	public Bookingroom() {
	}
	
	public int getIdbookingroom() {
		return idbookingroom;
	}

	public void setIdbookingroom(int idbookingroom) {
		this.idbookingroom = idbookingroom;
	}

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@JsonIgnore
	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}


}
