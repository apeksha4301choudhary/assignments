package com.assignment1;

import java.util.Scanner;

// Write a program to print sum of first N natural numbers.

public class Question_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n number : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum of " + n + " natural no is : " + sum);
	}
}
