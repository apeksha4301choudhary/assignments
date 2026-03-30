package com.assignment1;
// Write a program to find the largest of three numbers.

public class Question_7 {
	public static void main(String[] args) {
		int a,b,c;
		a = 15; 
		b = 63;
		c = 58;
		if(a > b && a > c) {
			System.out.println(a + " Greatest.");
		}
		else if(b > a && b > c) {
			System.out.println(b + " Greatest.");
		}
		else {
			System.out.println(c + " greatest.");
		}
	}
	
}
