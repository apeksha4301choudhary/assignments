package com.assignment_day_2_17_Feb_2026;

import java.util.Scanner;

public class GradeSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Maths = sc.nextInt();
		int Science = sc.nextInt();
		int History = sc.nextInt();
		
		int average = (Maths + Science + History)/3;
		System.out.println("Average Marks : " + average);
		
		switch(average/10) {
			case 10 :
			case 9: System.out.println("Grade : A");
				break;
			
			case 8:
			case 7: System.out.println("Grade : B");
				break;
			
			case 6:
			case 5: System.out.println("Grade : C");
				break;
				
			case 4:
			case 3 : System.out.println("Grade : D");
				break;
			
			case 2:
			case 1: System.out.println("Fail!");
			
			default : 
				break;
				
			
	}	
	}
}

