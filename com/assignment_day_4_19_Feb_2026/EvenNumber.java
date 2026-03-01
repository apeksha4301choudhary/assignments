package com.assignment_day_4_19_Feb_2026;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			if(i %2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
