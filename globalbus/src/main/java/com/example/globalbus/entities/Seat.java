package com.example.globalbus.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


	@Entity(name="seat")
	public class Seat implements Serializable{	
	
	@EmbeddedId
	private SeatEntity seatId;
	
	public SeatEntity getSeatId() {
		return seatId;
	}
	public void setSeatId(SeatEntity seatId) {
		this.seatId = seatId;
	}
	private int status;
	
	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
