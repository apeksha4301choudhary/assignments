package com.assignment_day_4_19_Feb_2026;

import java.util.Scanner;

//Write a Java program that asks the user for a number N and then prints the numbers from 1 to N using a

public class PrintNumbers {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
	}
}
