package com.assignment_2;


import java.util.Scanner;

class ExpressionEvaluator{

    public static int operatorPrecedence(int a, int b, int c){
        return (a + b) * c;
    }

    public static boolean logicalOperator(int a, int b, int c){
        if(a > b && b > c)
            return true;
        else    
            return false;
    }

    public static int modulus(int a, int b){
        return a % b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Three Numbers a : b : c =");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println("(a + b) * c : " + operatorPrecedence(a, b, c));
        // Here we will see the concept of operator precedence ->
        // in this problem the first precedence will ne of ()
        //therefore a + b will get executed first
        //thst after * a 


        System.out.println("a > b && b > c  : " + logicalOperator(a, b, c));
        //here will see the logical operator in this the first
        //get checked first, if it is true then only second 
        //condition will get checked
        // if both the conditions satisfied then it will return true
        //otherwise false

        System.out.println("a % b : " + modulus(a, b));
        //it prints the modulus od a//here the modulus means the remeinder
    }
}