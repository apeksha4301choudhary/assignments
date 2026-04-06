package com.assignment_2;


import java.util.Scanner;

class MobileRechargeSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Select a Valid Plan : ");
            System.out.println("1. Rs.199 -> 28 days validity");
            System.out.println("2. Rs.399 -> 56 days validity");
            System.out.println("3. Rs.599 -> 84 days validity");
            System.out.println("0. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enetr Monile Number : ");
                    long mobile = sc.nextLong();

                    System.out.println("Enetr Recharge Amount : ");
                    int amount = sc.nextInt();

                    System.out.println("Your recharge for Rs. 199 Successfull\n validity : 28 days");
                    break;

                case 2:
                    System.out.println("Enetr Monile Number : ");
                    long mobileNo = sc.nextLong();

                    System.out.println("Enetr Recharge Amount : ");
                    int rAmount = sc.nextInt();

                    System.out.println("Your recharge for Rs. 399 Successfull\n validity : 56 days");
                    break;

                case 3:
                    System.out.println("Enetr Monile Number : ");
                    long mobileNum = sc.nextLong();

                    System.out.println("Enetr Recharge Amount : ");
                    int amountRec = sc.nextInt();

                    System.out.println("Your recharge for Rs. 599 Successfull\n validity : 84 days");
                    break;

                case 0:
                    System.out.println("EXIT");
                    break;

                default:
                    System.out.println("Invalid Choice");
                    throw new AssertionError();
            }
        } while (choice != 0);
    }
}
