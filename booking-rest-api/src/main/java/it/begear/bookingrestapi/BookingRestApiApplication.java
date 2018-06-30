package it.begear.bookingrestapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import it.begear.bookingrestapi.models.User;
import it.begear.bookingrestapi.repositories.UserRepository;

@SpringBootApplication
public class BookingRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingRestApiApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner init(UserRepository repository) {
		return (args) -> {
			repository.save(new User("Mario", "Venezia", "venmar@libero.it"));
			repository.save(new User("Francesco", "Mascia", "fraver@libero.it"));
			repository.save(new User("Luigi", "Venezia", "luigvenez@libero.it"));
		};
	}
}
