package com.assignment1;

import java.util.Scanner;

/*
 
 Take marks of 5 subjects and:
● Calculate total
● Calculate percentage
● Print grade (A/B/C/Fail)
 
 */
public class Question_27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mathematics   :   ");
		int Mathematics = sc.nextInt();
		System.out.println("Physics       :   ");
		int Physics = sc.nextInt();
		System.out.println("Chemistry     :   ");
		int Chemistry = sc.nextInt();
		System.out.println("Hindi         :   ");
		int Hindi = sc.nextInt();
		System.out.println("English       :   ");
		int English = sc.nextInt();
		
		int total = Mathematics + Physics + Chemistry + Hindi + English;
		double percentage = total/5;
		
		String grade = (percentage >= 80) ? "A" :
						(percentage >= 60 && percentage <= 79) ? "B" :
							(percentage >= 40 && percentage <= 59) ? "C" : "Fail";
		
		System.out.println("Total : " + total + "\nPercentage : " + percentage + "\nGrade : "  + grade);
						
	}
}
