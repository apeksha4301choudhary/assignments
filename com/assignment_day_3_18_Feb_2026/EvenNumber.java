package com.assignment_day_3_18_Feb_2026;

import java.util.Scanner;

class ENumb{
	public void printEvenNumber(int num1 , int num2) {
		num1 = num1;
		while(num1 <= num2) {
			if(num1 %2 == 0) {
				System.out.print(num1 + " ");
			}
			num1++;
		}
	}
}

public class EvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number from where you want to start : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the number to where you want to end : ");
		int num2 = sc.nextInt();
		
		ENumb evenum = new ENumb();
		evenum.printEvenNumber(num1, num2);
	}
}
