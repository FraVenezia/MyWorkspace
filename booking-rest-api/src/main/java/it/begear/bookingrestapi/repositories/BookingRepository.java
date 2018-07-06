package it.begear.bookingrestapi.repositories;

import org.springframework.data.repository.CrudRepository;
import it.begear.bookingrestapi.models.Booking;

public interface BookingRepository extends CrudRepository<Booking, Integer>{
	
	
}
