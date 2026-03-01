package com.assignment_day_1_16_Feb_2026;

import java.util.Scanner;

public class OddEvenNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
		sc.close();
	}
}
