package com.assignment_day_3_18_Feb_2026;

import java.util.Scanner;

class Number{
	Scanner sc = new Scanner(System.in);
	int num;
	
	public void askForPositiveNumber() {
		do {
			System.out.println("Enter a positive number : ");
			num = sc.nextInt();
		}
		while(num < 0);
		
		System.out.println("You enterd a positive Number : " + num);
	}
	
}

public class PositiveNumbers {
	public static void main(String[] args) {
		Number n = new Number();
		n.askForPositiveNumber();
	}
}
