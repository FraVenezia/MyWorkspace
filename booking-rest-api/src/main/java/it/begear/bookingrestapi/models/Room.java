package it.begear.bookingrestapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iDRoom;
	@NotNull
	private int num;
	@NotNull
	private String typeroom;
	@NotNull
	private int beds;
	@NotNull
	private double price;
	
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
}
