package com.assignment_2;


import java.util.Scanner;

class EmployeeSalarySlipGenerator{
    String employeeName;
    int ID;
    double basicSalary;

    EmployeeSalarySlipGenerator(String employeeName, int ID, double basicSalary){
        this.employeeName = employeeName;
        this.ID = ID;
        this.basicSalary = basicSalary;
    }

    public double netSalary(double salary){
        double HRA = salary*0.2;

        double DA = salary*0.1;

        double PF = salary*0.08;

        double netSlary = salary + (HRA + DA + PF);
        return netSlary;
    }

    public void salarySlip(){
        System.out.println("----------Salary Slip---------");
        System.out.println("Name        :     " + this.employeeName + 
                           "ID          :     " + this.ID + 
                           "basicSalary :     " + this.basicSalary);
        System.out.println("----------Salary Slip---------");
        System.out.println("Net Salary  :     " + netSalary(basicSalary));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter ID : ");
        int id = sc.nextInt();

        System.out.print("Enter Salary : ");
        double salary = sc.nextDouble();

        EmployeeSalarySlipGenerator emp = new EmployeeSalarySlipGenerator(name, id, salary);


        emp.salarySlip();
    }
}