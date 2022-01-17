package com.example.globalbus.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SeatEntity implements Serializable {

	@Column(name="busId")
	private long busId;
	@Column(name="seatNo")
	private int seatNo;
	public SeatEntity(int i, int j) {
		// TODO Auto-generated constructor stub
		this.busId=i;
		this.seatNo=j;
	}
	public long getBusId() {
		return busId;
	}
	public void setBusId(long busId) {
		this.busId = busId;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	
	
	
}
