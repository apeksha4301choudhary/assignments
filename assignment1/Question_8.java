package com.assignment1;
// Write a program to check whether a year is a leap year.

public class Question_8 {
	public static void main(String[] args) {
		int year = 2005;
		if(year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}
	}
}
