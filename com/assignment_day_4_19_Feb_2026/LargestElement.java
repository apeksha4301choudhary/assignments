package com.assignment_day_4_19_Feb_2026;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		
		for(int i = 0 ; i < 5; i++) {
			System.out.println("Enter Element : ");
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int largestElement = arr[arr.length - 1];
		
		System.out.println("Largest Element is: " + largestElement);
	}
}
