package it.begear.bookingrestapi.controllers;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import it.begear.bookingrestapi.models.Room;
import it.begear.bookingrestapi.repositories.RoomRepository;

@CrossOrigin(origins = { "http://localhost:9000" }, maxAge = 3000)
@RestController
public class RoomController {
	
	public final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private RoomRepository roomRepository;

	@GetMapping("room")
	public List<Room> rooms() {
		LOGGER.info("sono in rooms");
		return (List<Room>) roomRepository.findAll();
	}

}
