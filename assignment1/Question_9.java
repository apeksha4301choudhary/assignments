package com.assignment1;

import java.util.Scanner;

/* Create a simple calculator using switch:
○ Input: two numbers + operator
○ Perform: +, -, *, /*/

public class Question_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char operator;
		a = sc.nextInt();
		b = sc.nextInt();
		operator = sc.next().charAt(0);
		
		switch (operator) {
		case '+': System.out.println(a + b);
			break;

		case '-': System.out.println(a - b);
			break;
			
		case '*': System.out.println(a * b);
			break;
			
		case '/': System.out.println(a / b);
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		}
	}
}
