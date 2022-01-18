package com.example.globalbus.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.globalbus.entities.Reservation;
import com.example.globalbus.entities.User;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

	@Query("from Reservation where user=:user")
	List<Reservation> findByUser(@Param("user") User user);

	

}
