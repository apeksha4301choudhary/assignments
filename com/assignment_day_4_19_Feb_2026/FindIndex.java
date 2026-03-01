package com.assignment_day_4_19_Feb_2026;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of elements you want to store : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i = 0; i < num ; i++) {
			System.out.println("Enter element : ");
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Enter a no to get the index : ");
		int search = sc.nextInt();
		
		int index = Arrays.binarySearch(arr, search);
		
		System.out.println("The no " + search + " is found at " + index);
	}
}
