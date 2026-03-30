package com.assignment1;

import java.util.Scanner;

/* Take a character input and print:
○ Next character
○ Previous character
*/

public class Question_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			char ch = sc.next().charAt(0);
			System.out.println("Next Character : " + (char)(ch + 1));
			System.out.println("Next Character : " + (char)(ch - 1));
	}
}
