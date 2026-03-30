package com.assignment1;
// Write a program to find factorial of a number.

public class Question_17 {
	public static void main(String[] args) {
		int n = 5;
		int sum = 1;
		for(int i = 1; i <= 5; i++) {
			sum *= i;
		}
		System.out.println("Factorial : " + sum);
	}
}
