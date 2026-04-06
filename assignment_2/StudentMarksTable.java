package com.assignment_2;


import java.util.Scanner;

class StudentMarksTable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] stud = new int[3][3];

        for(int i = 0; i < 3; i++){
            System.out.println("Student " + (i+1) + "-----");
            for(int j = 0; j<3; j++){
                System.out.println("Marks in Subject " + (j+1));
                stud[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            System.out.println();
            System.out.println("Marks of Student " + (i+1) + "-----");
            for(int j = 0; j<3; j++){
                System.out.println("Marks in Subject " + (j+1) + " : " + stud[i][j]);
            }
        }

        
    }
}