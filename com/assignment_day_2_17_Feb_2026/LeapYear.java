package com.assignment_day_2_17_Feb_2026;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a year to check wether it is leap year or not : ");
		int year1 = sc.nextInt();
		
		System.out.println("Enter a year to check wether it is leap year or not : ");
		int year2 = sc.nextInt();
		
		if(year1 % 4 == 0 && year1 % 100 != 0) {
			System.out.println(year1 + " is a leap year.");
		}
		else {
			System.out.println(year1 + " is not a leap year.");
		}
		
		if(year2 % 400 == 0) {
			System.out.println(year2 + " is a leap year.");
		}
		else {
			System.out.println(year2 + " is not a leap year.");
		}
	}
}
