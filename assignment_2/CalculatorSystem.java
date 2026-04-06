package com.assignment_2;


import java.util.Scanner;


class CalculatorSystem {

    public static  void calculate(int a, int b) {
        System.out.println("Sum of " + a + " & " + b + " : " + (a + b));
    }

    public static  void  calculate(double a, double b) {
        System.out.println("Sum of " + a + " & " + b + " : " + (a + b));
    }

    public static  void calculate(int a, int b, int c) {
        System.out.println("Sum of " + a + " , " + b + " & " + c +  " : " + (a + b + c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Integer type of number : ");
        int a  = sc.nextInt();
        int b  = sc.nextInt();
        int c  = sc.nextInt();

        System.out.println("Enter 2 Double type of number : ");
        double x  = sc.nextDouble();
        double y  = sc.nextDouble();

        calculate(a, b);
        System.out.println();
        calculate(x, y);
        System.out.println();
        calculate(a, b, c);
    }
}
