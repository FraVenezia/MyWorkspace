package it.begear.bookingrestapi.repositories;

import org.springframework.data.repository.CrudRepository;
import it.begear.bookingrestapi.models.Login;

public interface LoginRepository extends CrudRepository<Login, String>{
	
	
}
