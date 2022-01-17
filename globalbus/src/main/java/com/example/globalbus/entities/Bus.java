package com.example.globalbus.entities;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Bus extends AbstractEntity{

	private String busNumber;
	private String departureCity;
	private String arrivalCity;
	private String dateOfDeparture;
	private String departureTime;
	private String arrivalTime;
	private int fare;
	@Column(name="seatsavailable")
	private int seats_Available;
	
	
	
	public int getSeats_Available() {
		return seats_Available;
	}
	public void setSeats_Available(int seats_Available) {
		this.seats_Available = seats_Available;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public void setDateOfDeparture(String dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public String getDateOfDeparture() {
		return dateOfDeparture;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departurzeCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	
}
