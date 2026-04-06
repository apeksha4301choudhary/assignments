package com.assignment_2;
import java.util.Random;

class Bus{
	private String[] seat;  
	
	Bus() {
		seat  = new String[10];
		makeAvailable();
	}
	
	Random rand = new Random();
	int randomNumber = rand.nextInt(10); 
	
	public void makeAvailable() {
		for(int i = 0; i < 10; i++) {
			if(seat[i] == null) {
				seat[i] = "Available";
			}
		}
	}
	
	public void bookSeat() {
		if(seat[randomNumber].equals("Available")) {
			seat[randomNumber] = "Booked";
			System.out.println("Your Seat is Booked for " + randomNumber);
		}
		else {
			System.out.println("Seat is not Available.");
		}
	}
	
	public void displaySeats() {
		for(String s : seat) {
			System.out.println(s);
		}
	}
}

public class BusTicketBookingSystem {
	public static void main(String[] args) {
		Bus b = new Bus();
		b.bookSeat();
		b.displaySeats();
	}
}
