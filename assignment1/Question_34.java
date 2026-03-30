package com.assignment1;
// Print all prime numbers between 1 to 100.

public class Question_34 {
	public static void main(String[] args) {
		for(int n = 1; n <= 100; n++) {
			if(n<=1) {
				continue;
			}
			
			boolean isPrime = true;
			
			for(int i = 2; i < n; i++) {
				if(n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(n);
			}
		}
	}
}
