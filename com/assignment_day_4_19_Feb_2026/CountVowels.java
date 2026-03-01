package com.assignment_day_4_19_Feb_2026;

import java.util.Arrays;
import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		
		s = s.toLowerCase();
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count ++;
			}
		}
		
		System.out.println("The number of vowels in '" + s + "' is : " + count);
		
	}
}
