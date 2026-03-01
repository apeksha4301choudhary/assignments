package com.assignment_day_1_16_Feb_2026;

import java.util.Scanner;

public class AreaRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth of Rectangle : ");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		
		int areaOfRectangle = length*breadth;
		System.out.println("Area of Rectangle : " + areaOfRectangle);
		
		sc.close();
	}
}
