package com.assignment_day_4_19_Feb_2026;

import java.util.Scanner;

public class PallidromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		String rvrse = "";
		
		for(int i = 0; i < s.length(); i++) {
			rvrse = s.charAt(i) + rvrse;
		}
		
		if(s.equals(rvrse)) {
			System.out.println("The string " + s + "' is a palindrome");
		}
		else {
			System.out.println("The string " + s + "' is not a palindrome");
		}
	}
}
