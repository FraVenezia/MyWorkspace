package it.begear.bookingrestapi.repositories;

import org.springframework.data.repository.CrudRepository;
import it.begear.bookingrestapi.models.Customer;

public interface UserRepository extends CrudRepository<Customer, Integer>{
	
//	public List<Customer> findByCognome(String cognome);
	
}
