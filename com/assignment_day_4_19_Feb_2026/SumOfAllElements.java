package com.assignment_day_4_19_Feb_2026;

import java.util.Scanner;

public class SumOfAllElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		
		for(int i = 0 ; i < 5; i++) {
			System.out.println("Enter Element : ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int arr1 : arr) {
			sum += arr1;
		}
		
		System.out.println("The sum of all numbers is: " + sum);
	}
}
