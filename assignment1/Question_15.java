package com.assignment1;
// Write a program to count digits in a number.

public class Question_15 {
	public static void main(String[] args) {
		int num = 12345;
		int count =  0;
		while(num!=0) {
			int digit = num % 10;
			num = num / 10;
			count++;
		}
		System.out.println(count);
	}
}
