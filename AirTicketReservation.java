package com;

import java.util.ArrayList;
import java.util.Date;

public class AirTicketReservation {
	
	private ArrayList<Customer> customers=new ArrayList<>();
	private ArrayList<Flight> flights=new ArrayList<>();
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	public ArrayList<Flight> getFlights() {
		return flights;
	}
	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	}
	public AirTicketReservation(ArrayList<Customer> customers,
			ArrayList<Flight> flights) {
		super();
		this.customers = customers;
		this.flights = flights;
	}
	public AirTicketReservation() {
		super();
	}
	
	public Flight getFlight(String s,String d) throws FlightDoesNotExist
	{
		int c=0;
		Flight f=new Flight();
		for(int i=0;i<flights.size();i++){
			if(flights.get(i).getSource().equalsIgnoreCase(s) && flights.get(i).getDestination().equalsIgnoreCase(d)){
				f.setFlightId(flights.get(i).getFlightId());
				c=1;
			}
		}
		if(c==1){
			return f;
		}
		else{
			throw new FlightDoesNotExist(s,d);
		}
	}
	
	public Ticket bookTicket(int flightId,int custId,Date dateOfJourney,int noOfPersons) throws FlightNotFound,FlightAlreadyFull
	{
		int c=0;
		int d=0;
		int j=0;
		Ticket t=new Ticket();
		Flight p=new Flight();
		for(int i=0;i<flights.size();i++){
			if(flights.get(i).getFlightId()==flightId){
				if(flights.get(i).getDate().equals(dateOfJourney)){
					c++;
					j=i;
				if(flights.get(i).getSeatsRemaining()>noOfPersons){
					d++;
				}
			}
		}
		}
		Date ct=new Date();
		if(c==1 && d==1){
			p.setFlightId(flights.get(j).getFlightId());
			p.setSource(flights.get(j).getSource());
			p.setDestination(flights.get(j).getDestination());
			t.setTicketId(112);
			t.setBookingDate(ct);
			t.setJourneyDate(dateOfJourney);
			t.setPlane(p);
			t.setNoOfPersons(noOfPersons);
			flights.get(j).setSeatsRemaining(flights.get(j).getSeatsRemaining()-noOfPersons);
		}
		else if(c!=1){
			throw new FlightNotFound(flightId);
		}
		else if(c==1 && d!=1){
			throw new FlightAlreadyFull();
		}
		return t;
	}
	
}
