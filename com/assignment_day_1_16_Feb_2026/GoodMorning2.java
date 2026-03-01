package com.assignment_day_1_16_Feb_2026;

import java.util.Scanner;

public class GoodMorning2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter time in between 1 to 24 : ");
		int time = sc.nextInt();
		
		if(time < 12) {
			System.out.println("Good Morning");
		}
		sc.close();
	}
}
