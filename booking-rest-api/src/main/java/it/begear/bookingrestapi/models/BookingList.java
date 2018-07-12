package it.begear.bookingrestapi.models;

import java.util.Date;

public class BookingList {
	private int numbooking;
	private Date bookingdate;
	private String nome;
	private String cognome;
	private String email;
	private int num;
	private String typeroom;
	private Date checkin;
	private Date checkout;
	private double price;
	
	public BookingList() {
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
	
	
}
