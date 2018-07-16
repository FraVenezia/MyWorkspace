package it.begear.bookingrestapi.models;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

//@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="iDRoom", scope = Room.class)
@Entity
public class Room {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iDRoom;
	private int num;
	private String typeroom;
	private int beds;
	private double price;
	@OneToMany(mappedBy = "room",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Bookingroom> bookingroom;
	
	public Room() {
	}

	public int getiDRoom() {
		return iDRoom;
	}
	public void setiDRoom(int iDRoom) {
		this.iDRoom = iDRoom;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTyperoom() {
		return typeroom;
	}
	public void setTyperoom(String typeroom) {
		this.typeroom = typeroom;
	}
	public int getBeds() {
		return beds;
	}
	public void setBeds(int beds) {
		this.beds = beds;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@JsonIgnore
	public Set<Bookingroom> getBookingroom() {
		return bookingroom;
	}
	public void setBookingroom(Set<Bookingroom> bookingroom) {
		this.bookingroom = bookingroom;
	}
	
}
