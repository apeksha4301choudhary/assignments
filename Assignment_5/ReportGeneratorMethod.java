package com.Assignment_5;

import java.util.*;

class ReportGenerator{
    public static <T> void generateReport(List<T> data){
        System.out.println("----------Report----------");

        for(T o : data){
            System.out.println(o);
        }

        System.out.println("----------Report----------");

    }
}

public class ReportGeneratorMethod{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do { 
            System.out.println("Enter Report to Generate : ");
            System.out.println("1. Sales Report");
            System.out.println("2. Employee Report");
            System.out.println("3. Product Id Report");
            System.out.println("0. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    List<Integer> sales = new ArrayList<>();

                    System.out.print("Enter no of Sales Entries : ");
                    int noSales = sc.nextInt();

                    for(int i =0; i < noSales; i++){
                        System.out.println("Enter sale value : ");
                        sales.add(sc.nextInt());
                    }

                    ReportGenerator.generateReport(sales);
                    break;

                case 2:
                    List<String> emp = new ArrayList<>();

                    System.out.print("Enter Employee Number : ");
                    int noEmp = sc.nextInt();

                    for(int i =0; i < noEmp; i++){
                        sc.nextLine();
                        System.out.println("Enter Employee Name : ");
                        emp.add(sc.nextLine());
                    }

                    ReportGenerator.generateReport(emp);
                    break;

                case 3:
                    List<Integer> productId = new ArrayList<>();

                    System.out.print("Enter no of Products : ");
                    int noId = sc.nextInt();

                    for(int i =0; i < noId; i++){
                        System.out.println("Enter Product id : ");
                        productId.add(sc.nextInt());
                    }

                    ReportGenerator.generateReport(productId);
                    break;

                case 0:
                    System.out.println("Exit");
                    break;
                
                default:
                    throw new AssertionError();
            }
        } while (choice != 0);
    }
}
