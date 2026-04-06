package com.assignment_2;

import java.util.Scanner;

class Customer{
	private String customer_Name;
	private int customer_Number; 
	private int units_Consumed;
	
	Customer(){}
	
	Customer(String customer_Name, int customer_Number, int units_Consumed){
		this.customer_Name = customer_Name;
		this.customer_Number = customer_Number;
		this.units_Consumed = units_Consumed;
	}
	
	int billCalculator() {
		int bill;
		if(units_Consumed <= 100) {
			bill = units_Consumed * 5;
		}
		else if(units_Consumed <= 200 && units_Consumed > 100) {
			bill = units_Consumed * 7;
		}
		else {
			bill = units_Consumed * 10;
		}
		//System.out.println("Mr/Mrs. " + this.customer_Name + " Your Bill for this month is " + bill + " rs.");
		return bill;
	}
	
	int ifExceeds(int bill) {
		if(bill > 1500) {
			bill = bill + (bill*5)/100;
			return bill;
		}
		else 
			return bill;
	}
	
	void billDetails() {
		int bill = billCalculator();
		int finalBill = ifExceeds(bill);
		System.out.println();
		System.out.println("Name : " + customer_Name + "\nNumber : " + customer_Number + "\nBill : " + finalBill + " rs");;
	}
}

public class ElectricityBillCalculator {
	public static void main(String[] args) {
		String cName;
		int cNum;
		int units;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer Name : ");
		cName = sc.nextLine();
		System.out.print("Enter Customer Number : ");
		cNum = sc.nextInt();
		System.out.print("Enter Customer Units : ");
		units = sc.nextInt();
		
		Customer cust = new Customer(cName, cNum, units);
		cust.billDetails();
		
	}
}
