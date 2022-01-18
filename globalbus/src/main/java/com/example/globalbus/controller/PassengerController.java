package com.example.globalbus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.globalbus.entities.Passenger;
import com.example.globalbus.entities.User;
import com.example.globalbus.repos.PassengerRepository;
import com.example.globalbus.repos.UserRepository;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@EnableAutoConfiguration
@RequestMapping(value="api")
public class PassengerController {
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/addPassenger")
	public Passenger addPassenger(@RequestBody Passenger passenger) {
//		service.registerUser(user);
		return passengerRepository.save(passenger);
//		System.out.println(user);
	}
//	@PutMapping("/addPassenger")
//	public Passenger putPassenger(@RequestBody Passenger passenger) {
////		service.registerUser(user);
//		return passengerRepository.save(passenger);
////		System.out.println(user);
//	}
//		@PostMapping("/getPassenger")
//	    public List<Passenger> getPassengers(@RequestParam("user") long id) {
//			User user = userRepository.getById(id);
//	        return passengerRepository.findByUser(user);
//	    }
	@PostMapping("/getPassengers")
    public List<Passenger> getPassengers() {
        return passengerRepository.findAll();
    }
		
	

}

