package it.begear.bookingrestapi.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import it.begear.bookingrestapi.models.Booking;
import it.begear.bookingrestapi.models.Room;
import it.begear.bookingrestapi.models.SaveBooking;
import it.begear.bookingrestapi.repositories.BookingRoomRepository;
import it.begear.bookingrestapi.repositories.RoomRepository;
import it.begear.bookingrestapi.repositories.UserRepository;

@CrossOrigin(origins = { "http://localhost:9000" }, maxAge = 3000)
@RestController
public class SaveBookingController {

	public final static Logger LOGGER = LoggerFactory.getLogger(SaveBookingController.class);

	@Autowired
	private UserRepository repository;
	@Autowired
	private RoomRepository roomRepository;
	@Autowired
	private BookingRoomRepository bookingroomRepository;
	
	
	@PostMapping("save")
	public void createBooking(@RequestBody SaveBooking book) {
		int days = (int) ((book.getBookingroom().getCheckout().getTime()-book.getBookingroom().getCheckin().getTime()) / 86400000);
		List<Room> room= (List<Room>) roomRepository.findAll();
		for (Room tmp:room)
			if (tmp.getiDRoom()==book.getiDRoom())
					book.setRoom(tmp);
		
		book.getBooking().setPricetotal(book.getRoom().getPrice()*days);
		book.getBookingroom().setPrice(book.getRoom().getPrice()*days);
		
		book.getBooking().setCustomer(book.getCustomer());
		
		Set<Booking> bookAs = new HashSet<Booking>();
		bookAs.add(book.getBooking());
		book.getCustomer().setBooking(bookAs);
		
		book.getBookingroom().setBooking(book.getBooking());
		book.getBookingroom().setRoom(book.getRoom());
		
		repository.save(book.getCustomer());
		bookingroomRepository.save(book.getBookingroom());
		
	}

}
