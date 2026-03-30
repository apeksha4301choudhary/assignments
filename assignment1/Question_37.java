package com.assignment1;

import java.util.Scanner;

// 37. Check whether a number is perfect number.

public class Question_37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Nmber : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= num/2; i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		
		if(sum==num) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not Perfect");
		}
	}
}
