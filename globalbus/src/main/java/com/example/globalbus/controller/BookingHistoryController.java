package com.example.globalbus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.globalbus.entities.Reservation;
import com.example.globalbus.repos.ReservationRepository;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@EnableAutoConfiguration
@RequestMapping(value="api")
public class BookingHistoryController {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@GetMapping("/getHistory")
    public List<Reservation> getHistory() {
        return reservationRepository.findAll();
    }
	
	 @DeleteMapping("/deleteReservation/{id}")
	    public Long deleteReservation(@PathVariable Long id) {
	        reservationRepository.deleteById(id);
	        return id;
	    }
	
}
