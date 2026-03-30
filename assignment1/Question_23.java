package com.assignment1;

import java.util.Scanner;

// Write a program to find sum of even and odd numbers separately (1 to N).

public class Question_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumEven = 0;
		int sumOdd = 0;
		
		int N = sc.nextInt();
		
		//Sum of Even
		for(int i = 1; i <= N; i++) {
			if(i%2==0) {
				sumEven+=i;
			}
			else {
				sumOdd+=i;
			}
		}
		System.out.println("Sum of even : " + sumEven);
		System.out.println("Sum of odd  : " + sumOdd);
	}
}
