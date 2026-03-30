package com.assignment1;

import java.util.Scanner;

// Take user age and:
//● Check eligibility for voting
public class Question_28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		
		if(age>= 18) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}
	}
}
