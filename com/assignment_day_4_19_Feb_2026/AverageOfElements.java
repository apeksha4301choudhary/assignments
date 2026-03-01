package com.assignment_day_4_19_Feb_2026;

import java.util.Scanner;

public class AverageOfElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements you want to add : ");
		int num = sc.nextInt();
		
		int [] arr = new int[num];
		
		for(int i = 0 ; i < num; i++) {
			System.out.println("Enter Element : ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int arr1 : arr) {
			sum += arr1;
		}
		
		double average = sum/num;
		
		System.out.println("The average of the numbers is: " + average);
	}
}
