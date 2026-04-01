package com.assignment4java;
import java.util.Scanner;

import com.assignment4java.*;

class Product{
	private int productId;
	private String productName;
	private String price;
	
	Product(int productId, String productName, String price){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	double toConverStringtoDouble() {
		double productPrice = Double.parseDouble(price);
		return productPrice;
	}
}

class Order{
	private String customerName;
	private Product[] product;
	
	Order(){}
	
	Order(String customerName, Product[] product){
		this.customerName = customerName;
		this.product = product;
	}
	
	public double totalBill() {
		double total = 0;
		for(Product p : product) {
			if(p != null) {
				total += p.toConverStringtoDouble();
			}
		}
		return total;
	}
	
	public double totalBillCalculationWithDiscount() {
		double totalBillWithDiscount = 0;
		if(totalBill() > 1500) {
			totalBillWithDiscount = totalBill() -  totalBill() * 0.05;
		}
		else if(totalBill() > 2500) {
			totalBillWithDiscount = totalBill() -  totalBill() * 0.08;
		}
		else if(totalBill() > 5500) {
			totalBillWithDiscount = totalBill() -  totalBill() * 0.10;
		}
		else if(totalBill() > 10000) {
			totalBillWithDiscount = totalBill() -  totalBill() * 0.20;
		}
		else {
			totalBillWithDiscount = totalBill();
		}
		
		return totalBillWithDiscount;
	}
	
	public String toGenerateBill() {
		StringBuffer sb = new StringBuffer();
		sb.append("===============Bill===============").append("\n");
		sb.append("Customer Name    :   ").append(customerName).append("\n");
		sb.append("----------------------------------").append("\n");
		 sb.append(String.format("%-5s %-15s %-10s\n", "ID", "Name", "Price"));
		
		for(Product p : product) {
			if(p != null) {
				sb.append(String.format(
		                "%-5d %-15s ₹%-10.2f\n",
		                p.getProductId(),
		                p.getProductName(),
		                p.toConverStringtoDouble()
		            ));
			}
		}
		
		sb.append("----------------------------------").append("\n");
		sb.append("Final Payable Amount   :  ").append("₹").append(totalBillCalculationWithDiscount()).append("\n");
		sb.append("==================================").append("\n\n");
		
		return sb.toString();
	}
}

public class OnlineShoppingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String customerName;
		int noOfProducts;
		int productId;
		String productName;
		String price;
		
		System.out.println("Enter Customer Name : ");
		customerName = sc.next();
		
		System.out.println("Enter no of Products : ");
		noOfProducts = sc.nextInt();
		
		Product[] product = new Product[noOfProducts];
		if(noOfProducts <= 0) {
			throw new NumberFormatException("Enter Valid Number : ");
		}
		
		for(int i = 0; i< noOfProducts; i++) {
			System.out.println("Enter Product Id : ");
			productId = sc.nextInt();
			
			System.out.println("Enter Product Name : ");
			productName = sc.next();
			
			System.out.println("Enter Price : ");
			price = sc.next();
			
			product[i] = new Product(productId, productName, price);
		}
		
		Order o = new Order(customerName, product);
		
		System.out.println("Total Amont : " +  "₹ " +  o.totalBillCalculationWithDiscount());
		
		System.out.println("Choose Payment Option : ");
		System.out.println("1. UPI Payment");
		System.out.println("2. Card Payment");
		
		System.out.println("Enter Payment Way : ");
		int choice = sc.nextInt();
		
		if(choice != 1 && choice != 2) {
			throw new NumberFormatException("Enter Valid Choice");
		}
		
		
		Payment payment;
		
		UPIPayment upi = new UPIPayment();
		CardPayment crd = new CardPayment();
		
		if(choice == 1) {
			payment = new UPIPayment();
			upi.pay(o.totalBillCalculationWithDiscount());
		}
		else {
			payment = new CardPayment();
			crd.pay(o.totalBillCalculationWithDiscount());
		}
		
		System.out.println(o.toGenerateBill());
		
		System.out.println("Payment Successfull!");
		System.out.println("Amount Paid : " + o.totalBillCalculationWithDiscount());
	}
}
