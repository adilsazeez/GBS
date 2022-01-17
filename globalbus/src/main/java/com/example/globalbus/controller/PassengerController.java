package com.example.globalbus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.globalbus.entities.Passenger;
import com.example.globalbus.repos.PassengerRepository;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@EnableAutoConfiguration
@RequestMapping(value="api")
public class PassengerController {
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@PostMapping("/addPassenger")
	public Passenger addPassenger(@RequestBody Passenger passenger) {
//		service.registerUser(user);
		return passengerRepository.save(passenger);
//		System.out.println(user);
	}
		@GetMapping("/getPassenger")
	    public List<Passenger> getPassengers() {
	        return passengerRepository.findAll();
	    }
		
	

}

