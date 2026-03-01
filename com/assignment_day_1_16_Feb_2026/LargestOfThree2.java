package com.assignment_day_1_16_Feb_2026;

import java.util.Scanner;

public class LargestOfThree2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three positive Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b && a > c) {
			System.out.println(a + " is the largest number.");
		}
		else if(b > a && b > c) {
			System.out.println(b + " is the largest number.");
		}
		else {
			System.out.println(c + " is the largest number");
		}
		
		sc.close();
	}
}
