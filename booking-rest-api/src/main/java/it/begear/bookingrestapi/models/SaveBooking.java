package it.begear.bookingrestapi.models;

public class SaveBooking {
	private Customer customer;
	private Booking booking;
	private Bookingroom bookingroom;
	private Room room;
	private int iDRoom;
	
	public SaveBooking() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Bookingroom getBookingroom() {
		return bookingroom;
	}

	public void setBookingroom(Bookingroom bookingroom) {
		this.bookingroom = bookingroom;
	}
	
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getiDRoom() {
		return iDRoom;
	}

	public void setiDRoom(int iDRoom) {
		this.iDRoom = iDRoom;
	}

	
}
