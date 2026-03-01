package com.assignment_day_3_18_Feb_2026;

import java.util.Scanner;

class Multiplication{
	public void printMultiplicationTable(int num){
		for(int i = 1; i <= 10; i++) {
			int result = num * i;
			System.out.println(num + " x " + i + " = " + result);
		}
	}
}

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num  = sc.nextInt();
		
		Multiplication m = new Multiplication();
		m.printMultiplicationTable(num);
	}
}
