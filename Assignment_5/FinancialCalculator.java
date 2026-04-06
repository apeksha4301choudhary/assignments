package com.Assignment_5;

import java.util.*;

public class FinancialCalculator {
	 public static <T extends Number> void calculator(List<T> data) {
	        double sum = 0.0;

	        for (T value : data) {
	            sum += value.doubleValue();
	        }

	        double average = data.isEmpty() ? 0.0 : sum / data.size();

	        System.out.println("Sum     :     " + sum);
	        System.out.println("Average :     " + average);

	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        List<Integer> transaction = new ArrayList<>();
	        List<Double> salary = new ArrayList<>();

	        do {
	            System.out.println("Choose ro calculate : ");
	            System.out.println("1. Transaction");
	            System.out.println("2. Salary");
	            System.out.println("0. Exit");
	            choice = sc.nextInt();

	            if (choice == 1) {
	                System.out.print("Enter no of Transactions : ");
	                int noOFtran = sc.nextInt();

	                for (int i = 0; i < noOFtran; i++) {
	                    System.out.println();
	                    System.out.println("Transaction " + (i + 1) + "-----");
	                    System.out.print("Enter amount : ");
	                    int amount = sc.nextInt();
	                    transaction.add(amount);
	                }

	                System.out.println("Transaction Report----------");
	                calculator(transaction);
	            } else if (choice == 2) {
	                System.out.print("Enter no of Salaries : ");
	                int noOFSal = sc.nextInt();

	                for (int i = 0; i < noOFSal; i++) {
	                    System.out.println();
	                    System.out.println("Salaries " + (i + 1) + "-----");
	                    System.out.print("Enter amount : ");
	                    double amount = sc.nextInt();
	                    salary.add(amount);
	                }

	                System.out.println("Transaction Report----------");
	                calculator(salary);
	            } else if (choice == 0) {
	                System.out.println("Exit!");
	            } else {
	                System.out.println("Invalid Choice.");
	            }

	        } while (choice != 0);
	    }}
