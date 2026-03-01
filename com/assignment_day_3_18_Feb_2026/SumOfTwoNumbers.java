package com.assignment_day_3_18_Feb_2026;

import java.util.Scanner;

class Sum{
	public int sumToNum(int a, int b) {
		int sum = a + b;
		return sum;
	}
}

public class SumOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sum sm = new Sum();
		
		System.out.println("Enter 2 numbers to get the sum : ");
		System.out.println("Enter 1st number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd number : ");
		int num2 = sc.nextInt();
		
		sm.sumToNum(num1, num2);
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + sm.sumToNum(num1, num2));
		
	}
}
