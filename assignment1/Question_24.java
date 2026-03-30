package com.assignment1;
// Write a program to find largest digit in a number.

public class Question_24 {
	public static void main(String[] args) {
		int num = 124578;
		int max = 0;
		
		while(num!=0) {
			int digit = num % 10;
			if(max < digit) {
				max = digit;
			}
			num = num / 10;
		}
		System.out.println("max : " + max);
	}
}
