package com;

public class FlightNotFound extends Exception {
	
	int id;

	public FlightNotFound(int id) {
		super();
		this.id = id;
	}
	public String getMessage(){
		return "Flight with id: "+id+" could not be found";
	}

}
