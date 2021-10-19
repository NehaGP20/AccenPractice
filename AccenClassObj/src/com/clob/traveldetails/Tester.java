package com.clob.traveldetails;

import java.util.*;

public class Tester {

	public static BusTicket getTicketDetails() { // Input
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the passenger name:");
		person.setName(sc.next());
		System.out.println("Enter Gender (l/m)");
		person.setGender(sc.next().charAt(0));
		System.out.println("Enter the age:");
		person.setAge(sc.nextInt());
		
		BusTicket bt = new BusTicket();
		System.out.println("Enter the ticket no:");
		bt.setTicketNumber(sc.nextInt());
		System.out.println("Enter the ticket price:");
		bt.setTicketPrice(sc.nextFloat());
		
		return bt;	
	}
	public static void main(String[] args) {
		
		BusTicket bkt = getTicketDetails();
		bkt.calculateTotal();
		
		System.out.println("Ticket no:" + bkt.getTicketNumber());
		bkt.getPerson();
		System.out.println("Price of a ticket :" + bkt.getTicketPrice());
		System.out.println("Total Amount :" + bkt.getTotalAmount());
	}

}
