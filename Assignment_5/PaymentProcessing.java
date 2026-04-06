package com.Assignment_5;

import java.util.*;

abstract class Payment {

    int paymentId;
    double amount;

    public Payment() {
    }

    public Payment(int paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public abstract String displayPayment();
}

class CreditCardPayment extends Payment {

    int cardNumber;
    String bankName;

    CreditCardPayment(int paymentId, double amount, int cardNumber, String bankName) {
        super(paymentId, amount);
        this.cardNumber = cardNumber;
        this.bankName = bankName;
    }

    public String displayPayment() {
        return "PaymentId     :  " + paymentId
                + "\nAmount      :  " + amount
                + "\nCard No     :  " + cardNumber
                + "\nBank        :  " + bankName;
    }
}

class UPIPayment extends Payment {

    int UPIID;
    String appName;

    UPIPayment(int paymentId, double amount, int UPIID, String appName) {
        super(paymentId, amount);
        this.UPIID = UPIID;
        this.appName = appName;
    }

    public String displayPayment() {
        return "PaymentId      :  " + paymentId
                + "\nAmount       :  " + amount
                + "\nUPI ID       :  " + UPIID
                + "\nApp          :  " + appName;
    }
}

class PaymentProcessing {

    public static void display(List<? extends Payment> data) {
        for (Payment p : data) {
            System.out.println(p.displayPayment());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        List<CreditCardPayment> cardList = new ArrayList<>();
        List<UPIPayment> upiList = new ArrayList<>();

        do {
            System.out.println("Select Payment Option : ");
            System.out.println("1. Credit Card Payment");
            System.out.println("2. UPI Payment");
            System.out.println("3. Detail CardPayment");
            System.out.println("4. Details UPIPayment");
            System.out.println("0. EXIT!");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Payment Id : ");
                int paymentId = sc.nextInt();

                System.out.print("Enter Amount : ");
                double amount = sc.nextDouble();

                System.out.print("Enter Card Number : ");
                int cardNumber = sc.nextInt();

                System.out.print("Enter Bank Name : ");
                sc.nextLine();
                String bankName = sc.nextLine();

                cardList.add(new CreditCardPayment(paymentId, amount, cardNumber, bankName));
            } else if (choice == 2) {
                System.out.print("Enter Payment Id : ");
                int paymentId = sc.nextInt();

                System.out.print("Enter Amount : ");
                double amount = sc.nextDouble();

                System.out.print("Enter UPI Id : ");
                int upiId = sc.nextInt();

                System.out.print("Enter App Name : ");
                sc.nextLine();
                String appName = sc.nextLine();

                upiList.add(new UPIPayment(paymentId, amount, upiId, appName));
            } else if (choice == 3) {
                System.out.println("---------------Card Details---------------");
                display(cardList);
                System.out.println("---------------Card Details---------------");
            } else if (choice == 4) {
                System.out.println("---------------UPI Details---------------");
                display(upiList);
                System.out.println("---------------UPI Details---------------");
            } else if (choice == 0) {
                System.out.println("EXIT!");
            } else {
                System.out.println("Invalid Choice");
            }

        } while (choice != 0);
    }

}

