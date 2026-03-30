package com.assignment1;
/*
 
 Write a program to swap two numbers:
● With third variable
● Without third variable
 
 */
public class Question_25 {
	public static void main(String[] args) {
		int a , b;
		a = 5;
		b = 11;
		
		// with 3rd var
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("with 3rd var : " + a  + " " + b);
		
		// without 3rd var
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.println("without 3rd var : " + a  + " " + b);
	}
}
