package com.example.globalbus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.globalbus.entities.Bus;
import com.example.globalbus.repos.BusRepository;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@EnableAutoConfiguration
@RequestMapping(value="api")
public class BusDetailsController {
	

	@Autowired
	BusRepository busRepository;
	
	@PostMapping("/getBusDetails")
    public List<Bus> getBusDetails(@RequestParam("departureCity") String from, @RequestParam("arrivalCity") String to,@RequestParam("dateOfDeparture") String date) {
        return busRepository.findBuses(from,to,date);
    }
	
	@PostMapping("getAvailableSeats")
	public long getSeats(@RequestParam("id") int id) {
		return busRepository.getAvailableSeats(id);
	}
	
}
