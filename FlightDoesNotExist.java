package com;

public class FlightDoesNotExist extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String source;
	private String destination;

	public FlightDoesNotExist(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
	}
	
	public String getMessage(){
		String str="Flight with destination: "+destination+" and source: "+source+" does not exist";
		return str;
		
	}

}
