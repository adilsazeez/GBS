package com.example.globalbus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.globalbus.entities.Bus;
import com.example.globalbus.entities.Passenger;
import com.example.globalbus.repos.BusRepository;
import com.example.globalbus.repos.PassengerRepository;
import com.example.globalbus.repos.ReservationRepository;
import com.example.globalbus.repos.SeatRepository;



@CrossOrigin(origins ="http://localhost:3000")
@RestController
@EnableAutoConfiguration
@RequestMapping(value="api")
public class ReservationController {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@Autowired
	BusRepository busRepository;
	
	@Autowired
	SeatRepository seatRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	
	
	//Start of the reservation module, source & destination 
	//along with date will be accepted by this method
	@PostMapping("/createReservation")
	public String showReservation(@RequestParam("source") String source, @RequestParam("destination") String destination,@RequestParam("date") String date)  {
		

		List<Bus> busList = busRepository.findBuses(source,destination, date);
		for(Bus bus:busList) {
			System.out.println(bus.getId());
		}
		if(busList.size()==0)
			return "No Buses";
		System.out.println(source+destination);
		return "Bus List is printed on console";

}
	//Whichever bus user has selected will come here
	@PostMapping("/busSelection")
	public String busSelection(@RequestParam("busId") Long busId)  {
		Bus bus = busRepository.getById(busId);
		String busInfo = "Bus ID: "+bus.getId()+" Source: "+bus.getDepartureCity()+" Destination: "+bus.getArrivalCity()+" Departure Time: "+bus.getDepartureTime()+" Arrival Time: "+bus.getArrivalTime()+" Fare: "+bus.getFare();
//		List availableSeats = seatRepository.findAvailableSeats(busId);
//		Seat seat = seatRepository.getById(new SeatEntity(1,3));
//		return seat.toString();
//		System.out.println(availableSeats);
		
		return busInfo;
	

}	
	@PostMapping("/seatSelection")
	public String seatSelection(@RequestParam("busId") Long busId)  {
		Bus bus = busRepository.getById(busId);
		String busInfo = "Bus ID: "+bus.getId()+" Source: "+bus.getDepartureCity()+" Destination: "+bus.getArrivalCity()+" Departure Time: "+bus.getDepartureTime()+" Arrival Time: "+bus.getArrivalTime()+" Fare: "+bus.getFare();
		
		return busInfo;
	

}
	
	
	//Passenger Details will come here
	@PostMapping("/passengerDetails")
	public String passengerDetailsInput(@RequestBody Passenger passenger)  {
		passengerRepository.save(passenger);
		return "details added";
		

	}
	
	//Ticket gets displayed on the screen
//	@PostMapping("/confirmReservation")
//	public String confirmReservation(@RequestParam )  {
//
//			return "Ticket Display";
//
//		}
//	
//	@DeleteMapping("/{id}")
//	public int deleteReservation(@PathVariable long id) {
//		reservationRepository.deleteById(id);
//		return id;
//	}
//	
	
}
