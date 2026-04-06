package com.assignment_2;


import java.util.Scanner;

class SalaryConversionSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter salary : ");
        double salary = sc.nextDouble();

        //int (explicit casting)
        int intSal = (int)salary;
        System.out.println("Converted int Salary : " + intSal);

        //float (implicit casting)
        float flIntsal = intSal; 
        System.out.println("Converted int to float Salary : " + flIntsal);
        
        // here we will gwt the value loss when we ewre explicitly
        //type cast in int
        //25.89654 to 25

    }
}
