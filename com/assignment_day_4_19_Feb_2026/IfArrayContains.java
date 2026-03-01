package com.assignment_day_4_19_Feb_2026;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IfArrayContains {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements you want to store : ");
		int num = sc.nextInt();
		
		Integer[] arr = new Integer[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("Enter element : ");
			arr[i] = sc.nextInt();
		}
		
		List<Integer> l = Arrays.asList(arr);
		
		System.out.println("Enter a number to search : ");
		int search = sc.nextInt();
		
		if(l.contains(search)) {
			System.out.println("Found!");
		}
		else {
			System.out.println("Not Found!");
		}
	}
}
