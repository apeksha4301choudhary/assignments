package com.assignment_day_4_19_Feb_2026;

import java.util.Scanner;

public class SumOfOddNumbers {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			
			if(i %2 != 0) {
				sum += i;
			}
		}
		System.out.print( "The sum of odd numbers from 1 to " + num + " is " + sum);
	}
}
