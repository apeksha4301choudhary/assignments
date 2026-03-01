package com.assignment_day_4_19_Feb_2026;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of elements you want  to store : ");
		int num = sc.nextInt();
		int [] arr = new int[num];
		
		for(int i = 0 ; i < num; i++) {
			System.out.println("Enter Element : ");
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for(int arr1 : arr) {
			System.out.print(arr1 + " ");
		}
		
		
	}
}
