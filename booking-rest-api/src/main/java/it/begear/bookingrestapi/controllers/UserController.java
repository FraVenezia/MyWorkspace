package it.begear.bookingrestapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.begear.bookingrestapi.models.User;

@RestController
public class UserController {
	
	public final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@GetMapping("users")
	public List<User> users() {
		LOGGER.info("sono in user"); 
		return getUsersMock();
	}

	private List<User> getUsersMock() {
		List<User> users = new ArrayList<>();
		users.add(new User("Mario", "Venezia", "venmar@libero.it"));
		users.add(new User("Francesco", "Venezia", "fraver@libero.it"));
		users.add(new User("Luigi", "Venezia", "luigvenez@libero.it"));
		return users;
	}

}
