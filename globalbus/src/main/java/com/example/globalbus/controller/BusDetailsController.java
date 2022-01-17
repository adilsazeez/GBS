package com.example.globalbus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@GetMapping("/getBusDetails")
    public List<Bus> getHistory() {
        return busRepository.findAll();
    }
	
	@PostMapping("/busSelection/{id}")
    public Bus selectBus(@PathVariable Long id) {
		Bus bus=busRepository.getById(id);
		System.out.println(bus);
		return bus;
		
       
    }
}
