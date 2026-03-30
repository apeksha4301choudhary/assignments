package com.assignment1;
// Write a program to check whether a number is palindrome.

public class Question_16 {
	public static void main(String[] args) {
		int num = 12331;
		int palindrome = 0;
		int n = num;
		
		while(num!= 0) {
			int digit = num % 10;
			palindrome = palindrome * 10 + digit;
			num = num / 10;
		}
		if(palindrome == n) {
			System.out.println("Yes! Palindrome");
		}
		else {
			System.out.println("No! Not a Palindrome");
		}
	}
}
