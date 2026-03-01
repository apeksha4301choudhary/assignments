package com.assignment_day_4_19_Feb_2026;

import java.util.Scanner;

public class PrintNames {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of names you want to store : ");
		int n =sc.nextInt();
		
		String [] arr = new String[n];
		
		for(int i = 0 ; i < n; i++) {
			System.out.println("Enter Name : ");
			arr[i] = sc.next();
		}
		
		for(String arr1 : arr) {
			System.out.println(arr1);
		}
	}
}
