package com.assignment_2;


import java.util.Scanner;

class BankAccount{
     int accountNumber; 
     String namel; 
     double balance;

    public BankAccount() {
        //no arg constructor
    }

    public BankAccount(int accountNumber, String namel, double balance) {
        this.accountNumber = accountNumber;
        this.namel = namel;
        this.balance = balance;
    }

    BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    BankAccount(int accountNumber, String namel){
        this.accountNumber = accountNumber;
        this.namel = namel;
    }

    public void displayDetails(){
        System.out.println("Account Number : " + this.accountNumber + 
        "\nName : " + this.namel  + 
        "\nBalance : " + this.balance);
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter Account Number : ");
         int acNum = sc.nextInt();

         System.out.println("Enter Account Name : ");
         sc.nextLine();
         String acName = sc.nextLine();

         System.out.println("Enter balance : ");
         double balance = sc.nextDouble();
         
         BankAccount b = new BankAccount(acNum, acName, balance);

         b.displayDetails();
     }
}