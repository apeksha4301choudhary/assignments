package com.assignment_2;

import java.util.Scanner;

class Employeee{
    static int counter = 0;
    int empId;
    String empName;
    double salary;

    public Employeee(String empName, double salary) {
        counter++;
        this.empName = empName;
        this.salary = salary;
        this.empId = counter;
    }

    public void displayDetails(){
        System.out.println("Employee Id        :   " + empId + 
                            "\nEmployee Name     :   " + empName + 
                            "\nSalary          :   " + salary);
    }
}

public class EmployeeIdGenerator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr number of Employee : ");
        int noEmp = sc.nextInt();

        Employeee emp[] = new Employeee[noEmp];

        for(int i = 0; i < noEmp; i++){
            sc.nextLine();
            System.out.println();
            System.out.println("Employee Details " + (i+1) + " ----------");
            System.out.print("Enter Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Salary : ");
            double salary = sc.nextDouble();

            emp[i] = new Employeee(name, salary);
        }

        for(int i = 0; i < noEmp; i++){
        	System.out.println();
            System.out.println("----------Employee Details " + (i+1) + "----------");
            emp[i].displayDetails();
            System.out.println("----------Employee Details " + (i+1) + "----------");
            
        }
    }
}