package com.assignment1;
// Write a program to check whether a character is: Vowel or consonant

public class Question_10 {
	public static void main(String[] args) {
		char ch = 'l';
		
		if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is a vowel.");
		}
		else {
			System.out.println(ch + " is a consonent.");
		}
	}
}
