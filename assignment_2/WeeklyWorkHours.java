package com.assignment_2;



import java.util.Scanner;

class WeeklyWorkHours{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entere no of departments");
        int noOfDep = sc.nextInt();
        int noOfEmp;

        int hrs[][] = new int[noOfDep][];

        for(int i = 0; i < noOfDep; i++)
        {
            System.out.print("Entere no of employees in department " + (i + 1) + " : ");
            noOfEmp = sc.nextInt();
            hrs[i] = new int[noOfEmp];
            for(int j = 0; j < noOfEmp; j++){
                System.out.print("Enter Working hrs : ");
                hrs[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < noOfDep; i++)
        {
            System.out.println("Employee details of department " + (i + 1) + " : ");

            for(int j = 0; j < hrs[i].length; j++){
                System.out.println("Empolyee "+ (j+1) + " from department " + (i+1) + " : " +  hrs[i][j]);
               
            }
        }
         
    }
}