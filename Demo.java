package com;

import java.util.ArrayList;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		
		AirTicketReservation atr = new AirTicketReservation();
		
		ArrayList<Flight> f=new ArrayList<>();
		ArrayList<Customer> c=new ArrayList<>();
		
		
		Date d1=new Date("02/20/2017");
		Date d2=new Date("02/20/2017");
		
		Flight f1=new Flight(1, "Mumbai", "Delhi", 4000.0, 250, 200, d1);
		Flight f2=new Flight(2, "Delhi", "Mumbai", 2500, 250, 225, d2);
		
		f.add(f1);
		f.add(f2);
		atr.setFlights(f);
		
		Customer c1=new Customer(101, "Abhishek", "Jhansi", 7007229);
		Customer c2=new Customer(102, "Ashish", "Delhi", 9807062);
		c.add(c1);
		c.add(c2);
		atr.setCustomers(c);
		
		try{
			System.out.println(atr.getFlight("Delhi", "Mumbai").getFlightId());
		}catch(FlightDoesNotExist e){
			System.out.println(e.getMessage());
		}
		
		Date d3=new Date("02/22/2017");
		try{
			Ticket t=atr.bookTicket(1, 101, d3, 3);
			System.out.println(t.getTicketId()+" "+t.getBookingDate()+" "+t.getJourneyDate());
		}catch(FlightNotFound fe){
			System.out.println(fe.getMessage());
		}catch(FlightAlreadyFull faf){
			System.out.println(faf.getMessage());
		}
		
		
		
		
		
		
		
		
		
	}
}