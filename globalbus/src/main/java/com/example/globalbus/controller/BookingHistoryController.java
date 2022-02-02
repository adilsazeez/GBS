package com.example.globalbus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.globalbus.entities.Reservation;
import com.example.globalbus.entities.User;
import com.example.globalbus.repos.ReservationRepository;
import com.example.globalbus.repos.UserRepository;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@EnableAutoConfiguration
@RequestMapping(value="api")
public class BookingHistoryController {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@Autowired
	UserRepository userRepository;
	
//	@PostMapping("/getHistory")
//    public List<Reservation> getHistory() {
//        return reservationRepository.findAll();
//    }
	@PostMapping("/getHistory")
    public List<Reservation> getHistoryByUser(@RequestParam("user") int user) {
		User u = userRepository.getById((long) user);
        return reservationRepository.findByUser(u);
    }
	
	
	
	 @DeleteMapping("/deleteReservation/{id}")
	    public Long deleteReservation(@PathVariable int id) {
	        reservationRepository.deleteById((long) id);
	        return (long) id;
	    }
	
}
