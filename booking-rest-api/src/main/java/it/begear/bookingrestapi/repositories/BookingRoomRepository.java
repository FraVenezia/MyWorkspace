package it.begear.bookingrestapi.repositories;

import org.springframework.data.repository.CrudRepository;

import it.begear.bookingrestapi.models.Bookingroom;


public interface BookingRoomRepository extends CrudRepository<Bookingroom, Double>{
	
	
}
