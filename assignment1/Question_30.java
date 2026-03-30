package com.assignment1;
// Take a number and print its table until user stops (use loop).

import java.util.Scanner;

public class Question_30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String choice = "CONTINUE";
		while(!choice.equals("EXIT!")) {
			System.out.println("Enter a Number : ");
			int num = sc.nextInt();
			for(int i =1; i <= 10; i++ ) {
				System.out.println(num + " * " + i + " = " + num * i);
			}
			
			System.out.println("Enter CONTINUE to print another table or EXIT!");
			choice = sc.next();
		}
	}
}
