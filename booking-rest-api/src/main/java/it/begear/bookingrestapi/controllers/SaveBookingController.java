package it.begear.bookingrestapi.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import it.begear.bookingrestapi.models.Booking;
import it.begear.bookingrestapi.models.BookingList;
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
	

//	@GetMapping("allbooking")
//	public List<BookingList> allBooking() {
//		@Query(value = "SELECT Booking.NumBooking,Booking.BookingDate,Customer.Nome,Customer.Cognome,Customer.Email,Room.Num,Room.TypeRoom,BookingRoom.CheckIn,BookingRoom.CheckOut,BookingRoom.Price FROM Booking JOIN Customer,Room,BookingRoom WHERE Customer.IDUser=Booking.IDUSer AND Booking.NumBooking=BookingRoom.NumBooking AND BookingRoom.IDRoom=Room.IDRoom", nativeQuery = true)
//		List<BookingList> save();
//		return save;
//	}
	
	@PostMapping("save")
	public void createBooking(@RequestBody SaveBooking book) {
		List<Room> room= (List<Room>) roomRepository.findAll();
		for (Room tmp:room)
			if (tmp.getiDRoom()==book.getiDRoom())
					book.setRoom(tmp);
		
		book.getBooking().setPricetotal(book.getRoom().getPrice());
		book.getBookingroom().setPrice(book.getRoom().getPrice());
		
		book.getBooking().setCustomer(book.getCustomer());
		
		Set bookAs = new HashSet<Booking>();
		bookAs.add(book.getBooking());
		book.getCustomer().setBooking(bookAs);
		
		book.getBookingroom().setBooking(book.getBooking());
		book.getBookingroom().setRoom(book.getRoom());
		
		repository.save(book.getCustomer());
		bookingroomRepository.save(book.getBookingroom());
		
	}

}
