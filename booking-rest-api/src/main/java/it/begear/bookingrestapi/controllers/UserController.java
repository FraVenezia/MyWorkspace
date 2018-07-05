package it.begear.bookingrestapi.controllers;

import java.net.URI;
import java.util.List;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import it.begear.bookingrestapi.models.Customer;
import it.begear.bookingrestapi.repositories.UserRepository;

@CrossOrigin(origins = { "http://localhost:9000" }, maxAge = 3000)
@RestController
public class UserController {

	public final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserRepository repository;

	@GetMapping("users")
	public List<Customer> users() {
		LOGGER.info("sono in user");
		
		return (List<Customer>) repository.findAll();
	}
	
//	@GetMapping("users/{cognome}")
//	public List<Customer> usersByCognome(@PathVariable String cognome) {
//		return repository.findByCognome(cognome);
//	}

//	@PostMapping("users")
//	public ResponseEntity<?> addUser(@Valid @RequestBody Customer user,Errors errors) {
//		if (errors.hasErrors()) {
//			return ResponseEntity.badRequest().body("Ci sono errori");
//		}
//		Customer newUser = repository.save(user);
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().buildAndExpand(newUser.getCognome()).toUri();
//		return ResponseEntity.created(location).build();
//	}

	@PostMapping("inuser")
	public ResponseEntity<Customer> createStudent(@RequestBody Customer user) {
		Customer savedUser = repository.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{iDUser}").buildAndExpand(savedUser.getiDUser()).toUri();
		return ResponseEntity.created(location).build();
	}
}
