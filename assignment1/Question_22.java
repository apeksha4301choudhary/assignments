package com.assignment1;
// Write a program to check whether a number is prime.

public class Question_22 {
	public static void main(String[] args) {
		int num = 7;
		boolean isPrime = true;
		if(num <= 1) {
			isPrime = false;
		}
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}
}
