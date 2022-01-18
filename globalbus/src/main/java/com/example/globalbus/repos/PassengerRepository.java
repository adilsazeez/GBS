package com.example.globalbus.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.globalbus.entities.Passenger;
import com.example.globalbus.entities.User;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {

//	@Query("From Passenger where user=:user")
//	List<Passenger> findByUser(@Param("user") User user);

}
