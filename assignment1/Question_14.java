package com.assignment1;
// Write a program to reverse a number.

public class Question_14 {
	public static void main(String[] args) {
		int num = 12345;
		int rev = 0;
		
		while(num!=0) {
			int digit = num % 10;
			rev = rev * 10  + digit;
			num = num / 10;
		}
		System.out.println("Reverse Number : " + rev);
	}
}
