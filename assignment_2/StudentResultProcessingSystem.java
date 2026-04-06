package com.assignment_2;

import java.util.Scanner;

class Student{
	private String studentname;
	private int studentRollNumber;
//	double Maths, Physics, Chemistry, Hindi, english;
	int marks[];
	String subject[];
	
	Student(){}
	
	Student(String studentname,  int studentRollNumber, int marks[], String subject[]){
		this.studentname = studentname;
		this.studentRollNumber = studentRollNumber;
		this.marks = marks;
		this.subject = subject;
	}
	
	void subjectMarksDetails() {
		for(int i =0; i < subject.length; i++) {
			System.out.println(subject[i] + " : " + marks[i]);
		}
	}
	
	double total() {
		double total = 0;
		for(int i = 0; i < subject.length; i++) {
			total += marks[i];
		}
		return total;
	}
	
	double average() {
		double avg = total()/5;
		return avg;
	}
	
	double percentage() {
		double percent = average();
		return percent;
	}
	
	String grade() {
		String grade = (percentage() >= 90) ? "A" : 
			(percentage() >= 75 && percentage() <= 89) ? "B" : 
				(percentage() >= 75 && percentage() <= 89) ? "B" : 
					(percentage() >= 60 && percentage() <= 74) ? "C" :
						(percentage() >= 40 && percentage() <= 54) ? "B" : "Fail";
		
		return grade;				
	}
	
	void isPromoted() {
		if(!grade().equals("Fail")) {
			System.out.println("Name : " + studentname + "\nRollNumber : " + studentRollNumber + "\nMatrks : ");
			subjectMarksDetails();
			System.out.println("\nTotal of all marks : " + total() + 
			"\nPercenatge : " + percentage() + 
			"\nYour Grade : " + grade() + 
			"\nCongratulations! You are PROMOTED.");
		}
		else {
			System.out.println("Name : " + studentname + "\nRollNumber : " + studentRollNumber + "\nMatrks : " );
			subjectMarksDetails();
			System.out.println("\nTotal of all marks : " + total() + 
			"\nPercenatge : " + percentage() + 
			"\nYour Grade : " + grade() + 
			"\nSorry! You are NOT PROMOTED.");
		}
	}
}

public class StudentResultProcessingSystem {
	public static void main(String[] args) {
		String sName;
		int sRollNumber;
		int M, P, C, H, E;
		String subject[] = {"Mathematics", "Physics", "Chemistry", "Hindi", "English"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer Name : ");
		sName = sc.nextLine();
		System.out.print("Enter Your RollNumber : ");
		sRollNumber = sc.nextInt();
		System.out.println("Enter Your Marks : ");
		
		int marks[] = new int[subject.length];
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + " : ");
			marks[i] = sc.nextInt();
		}
		
		Student stud = new Student(sName, sRollNumber, marks, subject);
		stud.isPromoted();
	}
}
