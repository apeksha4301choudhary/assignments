package com.assignment_day_3_18_Feb_2026;

import java.util.Scanner;


//==============Poblem1==============================================
 class GradeSystem {
	public void gradeSystem() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Math Marks : ");
		int Maths = sc.nextInt();
		
		System.out.println("Enter Science Marks : ");
		int Science = sc.nextInt();
		
		System.out.println("Enter History  Marks : ");
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


//=====================================Problem2===========================================
 class LeapYear {
	public  void leapYear() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a year to check wether it is leap year or not : ");
		int year1 = sc.nextInt();
		
		System.out.println("Enter a year to check wether it is leap year or not : ");
		int year2 = sc.nextInt();
		
		if(year1 % 4 == 0 && year1 % 100 != 0) {
			System.out.println(year1 + " is a leap year.");
		}
		else {
			System.out.println(year1 + " is not a leap year.");
		}
		
		if(year2 % 400 == 0) {
			System.out.println(year2 + " is a leap year.");
		}
		else {
			System.out.println(year2 + " is not a leap year.");
		}
	}
}

//========================================Problem 3 =======================================
 class DaysOfWeek {
	public  void daysOfWeek() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of weeks between 1 to 7 : ");
		int week = sc.nextInt();
		
		switch(week) {
		case 1 : System.out.println("The day is Monday.");
			break;
			
		case 2 : System.out.println("The day is Tuesday.");
			break;
		
		case 3 : System.out.println("The day is Wednesday.");
			break;
		
		case 4 : System.out.println("The day is Thursday.");
			break;
		
		case 5 : System.out.println("The day is Friday.");
			break;
		
		case 6 : System.out.println("The day is Saturday.");
			break;
		
		case 7 : System.out.println("The day is Sunday.");
			break;
			
		default : System.out.println("Invalid Day Number.");
			break;
		}
	}
}

//======================================Problem 4==========================
 class Values{
		byte a; 
		short b; 
		int c; 
		long d; 
		float e; 
		double f; 
		char g; 
		boolean h;
		
	}
 
public class MenuDriven {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Problem no : ");
		int choice = sc.nextInt();
		
		GradeSystem gs = new GradeSystem();
		LeapYear lp = new LeapYear();
		DaysOfWeek dw = new DaysOfWeek();
		Values v = new Values();
		
		
		
		switch(choice) {
			case 1 : gs.gradeSystem();
			break;
			
			case 2 : lp.leapYear();
			break;
			
			case 3 : dw.daysOfWeek();
			break;
			
			case 4 : 
				System.out.println(v.a);
				System.out.println(v.b);
				System.out.println(v.c);
				System.out.println(v.d);
				System.out.println(v.e);
				System.out.println(v.f);
				System.out.println(v.g);
				System.out.println(v.h);
			break;
			
			default: System.out.println("EXIT!");
			break;
		}
	}
}
