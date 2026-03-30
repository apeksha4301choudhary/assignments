package com.assignment1;

import java.util.Scanner;

// Find LCM of two numbers.

public class Question_36 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int a = sc.nextInt();
	        int b = sc.nextInt();

	        int x = a, y = b;

	        // find GCD
	        while (y != 0) {
	            int temp = y;
	            y = x % y;
	            x = temp;
	        }

	        int gcd = x;
	        int lcm = (a * b) / gcd;

	        System.out.println("LCM = " + lcm);
	}
}
