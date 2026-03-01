package com.assignment_day_1_16_Feb_2026;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate area of square : ");
		int side = sc.nextInt();
		
		int area = side * side;
		System.out.println("Area of Square : " + side);
		
	}
}
