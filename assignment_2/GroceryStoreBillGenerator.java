package com.assignment_2;


import java.util.Scanner;

class GroceryStoreBillGenerator {

    String itemName[];
    int quantity[];
    double price[];
    double totals[];

    public double totalAmount(int noOfItems) {
        double total = 0;
        for (int i = 0; i < noOfItems; i++) {
            total += totals[i];
        }

        if (total > 3000) {
            total = total - total * 0.1;
        }
        return total;
    }

    public void displayBill(int noOfItems) {
        System.out.println("------------Bill------------");
        for (int i = 0; i < noOfItems; i++) {

            System.out.println(itemName[i] + "  :  " + price[i] + "rs" + "  :  " + quantity[i] + "kg    :    " + totals[i] + "rs");
        }
        System.out.println("------------Bill------------");
        System.out.println("Total Amount woith discount of 10% : " + totalAmount(noOfItems));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Enter no of items : ");
        int noOfItems = sc.nextInt();

            GroceryStoreBillGenerator gc = new GroceryStoreBillGenerator();

            gc.itemName = new String[noOfItems];
            gc.quantity = new int[noOfItems];
            gc.price = new double[noOfItems];
            gc.totals = new double[noOfItems];

            System.out.println("Add Items : ");
            System.out.println("1. Sugar : 120rs /kg");
            System.out.println("2. Rice : 250rs /kg");
            System.out.println("3. Wheat : 178rs /kg");
            System.out.println("4. Gram : 112rs /kg");
            System.out.println("5. Tea : 360rs /kg");
            

            for (int i = 0; i < noOfItems; i++) {
            	System.out.println("Add Item : ");
            	choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        gc.itemName[i] = "Sugar";
                        System.out.print("Enter quantity : ");
                        gc.quantity[i] = sc.nextInt();
                        gc.price[i] = 120;
                        gc.totals[i] = gc.quantity[i] * gc.price[i];
                        break;

                    case 2:
                        gc.itemName[i] = "Rice";
                        System.out.print("Enter quantity : ");
                        gc.quantity[i] = sc.nextInt();
                        gc.price[i] = 250;
                         gc.totals[i] = gc.quantity[i] * gc.price[i];
                        break;

                    case 3:
                        gc.itemName[i] = "Wheat";
                        System.out.print("Enter quantity : ");
                        gc.quantity[i] = sc.nextInt();
                        gc.price[i] = 178;
                         gc.totals[i] = gc.quantity[i] * gc.price[i];
                        break;

                    case 4:
                        gc.itemName[i] = "Gram";
                        System.out.print("Enter quantity : ");
                        gc.quantity[i] = sc.nextInt();
                        gc.price[i] = 112;
                         gc.totals[i] = gc.quantity[i] * gc.price[i];
                        break;

                    case 5:
                        gc.itemName[i] = "Tea";
                        System.out.print("Enter quantity : ");
                        gc.quantity[i] = sc.nextInt();
                        gc.price[i] = 360;
                         gc.totals[i] = gc.quantity[i] * gc.price[i];
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        throw new AssertionError();
                }
            }
            gc.displayBill(noOfItems);
        }
    }
