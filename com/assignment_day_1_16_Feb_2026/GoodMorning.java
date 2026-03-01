package com.assignment_day_1_16_Feb_2026;

import java.time.LocalTime;
import java.util.Scanner;

public class GoodMorning {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LocalTime t = LocalTime.of(12, 0);
		
		System.out.println("Enter time in hour and minute : ");
		int hr = sc.nextInt();
		int min = sc.nextInt();
		LocalTime time = LocalTime.of(hr, min);
		
		if(time.isBefore(t)) {
			System.out.println("Good Morning");
		}
		sc.close();
	}
}
