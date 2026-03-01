package com.assignment_day_3_18_Feb_2026;

import java.util.Scanner;

class Age{
	public void ageChecker(int age) {
		
		if(age <= 18) {
			System.out.println("You are Minor.");
		}
		else if(age <= 60) {
			System.out.println("You are an adult.");
		}
		else {
			System.out.println("You are a senior citizen.");
		}
	}
}

public class AgeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		
		Age ag = new Age();
		ag.ageChecker(age);
		
		
	}
}
