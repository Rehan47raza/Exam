package com;

import java.util.Date;

public class Flight {
	
	private int flightId;
	private String source;
	private String destination;
	private double cost;
	private int totalseats;
	private int seatsRemaining;
	private Date date;
	
	public Flight() {
		super();
	}

	public Flight(int flightId, String source, String destination, double cost,
			int totalseats, int seatsRemaining, Date date) {
		super();
		this.flightId = flightId;
		this.source = source;
		this.destination = destination;
		this.cost = cost;
		this.totalseats = totalseats;
		this.seatsRemaining = seatsRemaining;
		this.date = date;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getTotalseats() {
		return totalseats;
	}

	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}

	public int getSeatsRemaining() {
		return seatsRemaining;
	}

	public void setSeatsRemaining(int seatsRemaining) {
		this.seatsRemaining = seatsRemaining;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Flight []";
	}
	
	
	
	
	

}
