package com.assignment4java;
import java.util.Scanner;

import com.assignment4java.*;

public interface Payment {
	void pay(double amount);
    void refund(double amount);
}

class UPIPayment implements Payment{
	Order d = new Order();
	public void pay(double amount) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount to pay : ");
		double payAmount = sc.nextDouble();
		
		if(payAmount != amount) {
			throw new NumberFormatException("Invalid amount! Please Enter correct amount.");
		}
			
		System.out.println("UPI payment done!\n");
	}
	
	public void refund(double amount) {
		System.out.println("UPI refund is successfull!\nFor ₹ " + amount);
	}
}

class CardPayment implements Payment{
	Order d = new Order();
	public void pay(double amount) {
		Scanner sc = new Scanner(System.in);
		double payAmount = sc.nextDouble();
		
		if(payAmount != amount) {
			throw new NumberFormatException("Invalid amount! Please Enter correct amount.");
		}
		
			System.out.println("Card payment done!\n");
	}
	
	public void refund(double amount) {
		System.out.println("Card refund is successfull!\nFor ₹ " + amount);
	}
}
