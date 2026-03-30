package com.assignment1;
/*
 Print numbers from 1 to 50 using:
● for loop
● while loop
 */


public class Question_11 {
	public static void main(String[] args) {
		// using for loop
		System.out.println("For loop ------------------");
		for(int i = 1 ; i <= 50 ; i++) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("While loop ------------------");
		int count = 1;
		while(count<=50) {
			System.out.println(count);
			count++;
		}
	}
}
