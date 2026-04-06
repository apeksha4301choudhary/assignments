package com.Assignment_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Electronics {

    String productName;
    double price;

    Electronics(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String toString() {
        return this.productName + " : " + this.price;
    }
}

class Clothing {

    String brand;
    String productName;
    char size;
    double price;

    Clothing(String brand, String productName, char size, double price) {
        this.brand = brand;
        this.productName = productName;
        this.size = size;
        this.price = price;
    }

    public String toString() {
        return "Brand     :     " + this.brand + "\n"
                + "Product  :     " + this.productName + "\n"
                + "Size     :     " + this.size + "\n"
                + "Price    :     " + this.price;
    }
}

class Inventory<T> {

    List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        if (product != null) {
            products.add(product);
        }
    }

    public List<T> getProduct() {
        return products;
    }
}

public class ECommerceInventoryContainer{

    public static void displaydetails(Inventory<?> i) {
        System.out.println("---------------Product Details---------------");
        for (Object o : i.getProduct()) {
            System.out.println(o);
        }
        System.out.println("---------------Product Details---------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        Inventory<Electronics> el = new Inventory<Electronics>();
        Inventory<Clothing> cl = new Inventory<Clothing>();

        do {
            System.out.println("Choose Product Type : ");
            System.out.println("1. Electronics");
            System.out.println("2. Clothing");
            System.out.println("3. Display Electronics Details");
            System.out.println("4. Display Clothing Details");
            System.out.println("0. Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter number of products : ");
                int noProd = sc.nextInt();

                for (int i = 0; i < noProd; i++) {
                    sc.nextLine();
                    System.out.println();
                    System.out.println("Product Details " + (i + 1));
                    System.out.print("Enter Product : ");
                    String product = sc.nextLine();

                    System.out.print("Enter Price : ");
                    double price = sc.nextDouble();

                    el.addProduct(new Electronics(product, price));
                }
            } else if (choice == 2) {
                System.out.print("Enter number of products : ");
                int noProd = sc.nextInt();

                for (int i = 0; i < noProd; i++) {
                    sc.nextLine();
                     System.out.println();
                    System.out.println("Product Details " + (i + 1));
                    System.out.print("Enter Brand : ");
                    String brand = sc.nextLine();

                    System.out.print("Enter Product : ");
                    String product = sc.nextLine();

                    System.out.print("Enter Size : ");
                    char size = sc.next().charAt(0);

                    System.out.print("Enter Price : ");
                    double price = sc.nextDouble();

                    cl.addProduct(new Clothing(brand, product, size, price));
                }
            } else if (choice == 3) {
                displaydetails(el);
            } else if (choice == 4) {
                displaydetails(cl);
            } else if (choice == 0) {
                System.out.println("EXIT!");
            } else {
                System.out.println("Invalid choice");
            }
        } while (choice != 0);

    }
}
