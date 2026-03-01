package com.assignment_day_2_17_Feb_2026;

import java.util.Scanner;

public class DaysOfWeek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of weeks between 1 to 7 : ");
		int week = sc.nextInt();
		
		switch(week) {
		case 1 : System.out.println("The day is Monday.");
			break;
			
		case 2 : System.out.println("The day is Tuesday.");
			break;
		
		case 3 : System.out.println("The day is Wednesday.");
			break;
		
		case 4 : System.out.println("The day is Thursday.");
			break;
		
		case 5 : System.out.println("The day is Friday.");
			break;
		
		case 6 : System.out.println("The day is Saturday.");
			break;
		
		case 7 : System.out.println("The day is Sunday.");
			break;
			
		default : System.out.println("Invalid Day Number.");
			break;
		}
	}
}
