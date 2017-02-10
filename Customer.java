package com;

import java.util.ArrayList;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String address;
	private long phoneNo;
	ArrayList<Ticket> tickets=new ArrayList<>();
	
	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, String address,
			long phoneNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Customer []";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	
	
	
	
	
	
	

}
