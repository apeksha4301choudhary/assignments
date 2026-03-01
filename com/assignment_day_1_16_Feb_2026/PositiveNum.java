package com.assignment_day_1_16_Feb_2026;

import java.util.Scanner;

public class PositiveNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("Its a Positive Number.");
		}
		else {
			System.out.println("Its a Negative Number.");
		}
		
		sc.close();
	}
}
