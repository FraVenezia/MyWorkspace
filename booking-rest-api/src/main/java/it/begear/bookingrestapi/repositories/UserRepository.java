package it.begear.bookingrestapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.begear.bookingrestapi.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public List<User> findByCognome(String cognome);

}
