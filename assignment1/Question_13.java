package com.assignment1;

import java.util.Scanner;

// Write a program to print multiplication table of a number.

public class Question_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter  number : ");
		int num = sc.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}
}
