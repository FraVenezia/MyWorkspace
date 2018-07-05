package it.begear.bookingrestapi.repositories;

import org.springframework.data.repository.CrudRepository;
import it.begear.bookingrestapi.models.Room;

public interface RoomRepository extends CrudRepository<Room, Integer>{

}
