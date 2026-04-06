package com.assignment_2;


import java.util.Scanner;

class StudentCounterSystem{
    String name;
    int rollNo;
    static int totalStudent = 0;

    public StudentCounterSystem(String name, int rollNo) {
        totalStudent++;
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayDetails(){
        System.out.println("Name : " + this.name + 
        "\nRoll No : " + this.rollNo);
    }

    public static void totalStudent(){
        System.out.println("Total Students : " + totalStudent);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Students : ");
        int noSt = sc.nextInt();

        StudentCounterSystem[] stud = new StudentCounterSystem[noSt];

        for(int i = 0; i < noSt; i++){
        	sc.nextLine();
            System.out.print("Enter Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Roll No : ");
            int roll = sc.nextInt();

            stud[i] = new StudentCounterSystem(name, roll);
        }

        for(int i = 0; i < noSt; i++){
            System.out.println();
            System.out.println("Student " + (i+1) + " details-----");

            stud[i].displayDetails();
        }

        System.out.println();
        totalStudent();
    }
}