package com.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Bus {

	
	private String bus_id;
	@Id
	private String bus_no;
	private String no_of_seats;

	public String getBus_id() {
		return bus_id;
	}

	public void setBus_id(String bus_id) {
		this.bus_id = bus_id;
	}

	public String getBus_no() {
		return bus_no;
	}

	public void setBus_no(String bus_no) {
		this.bus_no = bus_no;
	}

	public String getNo_of_seats() {
		return no_of_seats;
	}

	public void setNo_of_seats(String no_of_seats) {
		this.no_of_seats = no_of_seats;
	}

	public Bus() {
		super();
	}

	@Override
	public String toString() {
		return "Bus [bus_id=" + bus_id + ", bus_no=" + bus_no + ", no_of_seats=" + no_of_seats + "]";
	}
	
	
}
