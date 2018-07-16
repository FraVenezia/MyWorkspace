package it.begear.bookingrestapi.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import it.begear.bookingrestapi.models.Login;
import it.begear.bookingrestapi.repositories.LoginRepository;

@CrossOrigin(origins = { "http://localhost:9000" }, maxAge = 3000)
@RestController
public class LoginController {

	public final static Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LoginRepository loginRepository;

	@PostMapping("login")
	public int login(@RequestBody Login log) {
		LOGGER.info("Sono nel Login");
		if (log.getPassword().equals(loginRepository.findById(log.getUsername()).get().getPassword()))
			return 1;
		else
			return 0;
	}

}
