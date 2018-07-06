package it.begear.bookingrestapi.controllers;

import java.net.URI;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import it.begear.bookingrestapi.models.Booking;
import it.begear.bookingrestapi.models.Customer;
import it.begear.bookingrestapi.repositories.BookingRepository;


@CrossOrigin(origins = { "http://localhost:9000" }, maxAge = 3000)
@RestController
public class BookingController {
	
	public final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private BookingRepository bookingRepository;

	@GetMapping("booking")
	public List<Booking> rooms() {
		LOGGER.info("sono in booking");
		return (List<Booking>) bookingRepository.findAll();
	}
	
	@PostMapping("savebooking")
	public ResponseEntity<Customer> createStudent(@RequestBody Booking booking) {
		Booking savedBooking = bookingRepository.save(booking);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{numBooking}").buildAndExpand(savedBooking.getNumbooking()).toUri();
		return ResponseEntity.created(location).build();
	}

}
