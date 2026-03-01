package com.assignment_day_3_18_Feb_2026;

import java.util.Scanner;

class CalculateSum{
	public void calculateSum(int num){
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("The sum of numbers from 1 to " + num + " is " + sum);
	}
}

public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		CalculateSum csum = new CalculateSum();
		csum.calculateSum(num);
	}
}
