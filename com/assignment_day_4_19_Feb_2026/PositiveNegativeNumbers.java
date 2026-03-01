package com.assignment_day_4_19_Feb_2026;

import java.util.Scanner;

public class PositiveNegativeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements you want to store : ");
		int num = sc.nextInt();
		
		int [] arr = new int[num];
		
		int posCount = 0;
		int negCount = 0;
		for(int i = 0; i < num; i++) {
			System.out.println("Enter element : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] > 0) {
				posCount++;
			}
			else
				negCount++;
		}
		System.out.println("Positive Numbers : " + posCount);
		System.out.println("Negative Numbers : " + negCount);
	}
}
