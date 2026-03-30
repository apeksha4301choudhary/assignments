package com.assignment1;
// Write a program to print Fibonacci series up to N terms.

public class Question_18 {
	public static void main(String[] args) {
		int n = 10;
		int first = 0;
		int second = 1;
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(first);
			int temp = first + second;
			first = second;
			second = temp;
			
			
		}
	}
}
