package com.clob.traveldetails;

public class BusTicket {
	
	private int ticketNumber;
	private float ticketPrice;
	private float totalAmount;
	private Person person;
	
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public float getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Person getPerson() {
		System.out.println("Passenger Name:" + person.getName());
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

	public void calculateTotal() {
		float amount;
		
		if(person.getAge() < 16) {
			amount = (ticketPrice/100) * 50;
			totalAmount = ticketPrice - amount;
		}else if(person.getGender() == 'l' && person.getAge() < 16 && person.getAge() >= 60) {
			amount = (ticketPrice/100) * 10;
			totalAmount = ticketPrice - amount;
		}else if(person.getAge() >= 60) {
			amount = (ticketPrice/100) * 25;
			totalAmount = ticketPrice - amount;
		}else {
			totalAmount = ticketPrice;
		}
		
		setTotalAmount(totalAmount);
	}

}
