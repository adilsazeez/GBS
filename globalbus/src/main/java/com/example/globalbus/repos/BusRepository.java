package com.example.globalbus.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.globalbus.entities.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {

	@Query("From Bus where departureCity=:departureCity and arrivalCity=:arrivalCity and date_of_departure=:date_of_departure")
	List<Bus> findBuses(@Param("departureCity") String source,@Param("arrivalCity") String destination,@Param("date_of_departure") String date);
	
	@Query("Select b.seats_Available from Bus b where id=:id")
	int getAvailableSeats(@Param("id") long id);

	@Transactional
	@Modifying
	@Query("Update Bus b Set b.seats_Available=b.seats_Available-1 where b.id=:id ")
	void reduceSeatsByOne(@Param("id")long id);

}
