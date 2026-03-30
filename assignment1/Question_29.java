package com.assignment1;

import java.util.Scanner;

/*
 
 Create a menu-driven program:
1. Add
2. Subtract
3. Exit 
  
 */
public class Question_29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Add");
			System.out.println("2. Substract");
			System.out.println("3. Exit");
			System.out.println();
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: System.out.println("Enter Two Number : ");
					int a = sc.nextInt();
					int b = sc.nextInt();
					System.out.println("Addition : " + (a+b));
					break;
					
			case 2: System.out.println("Enter Two Number : ");
					int x = sc.nextInt();
					int y = sc.nextInt();
					System.out.println("Addition : " + (x-y));
					break;
					
			case 3: System.out.println("EXIT!");
					break;
					
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
		} while (choice!=3);
	}
}
