package com.assignment_2;
import java.util.Scanner;
class AccountHolder{
	private String name;
	private long accountNumber;
	private String Password;
	private double balance;
	
	public AccountHolder() {
		// TODO Auto-generated constructor stub
	}
	
	public AccountHolder(String name, long accountNumber, String Password, double balance) {
		// TODO Auto-generated constructor stub
		this.name =  name;
		this.accountNumber =  accountNumber;
		this.Password =  Password;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}

class Services{
	Scanner sc = new Scanner(System.in);
	AccountHolder accountHolderDetails;
	public Services(AccountHolder accountHolderDetails) {
		this.accountHolderDetails = accountHolderDetails;
	}
	
	void checkBalance() {
		System.out.println("Enter Your Account Number : ");
		long cusNumber =sc.nextLong();
		sc.nextLine();
		System.out.println("Enter You Password : ");
		String cusPass = sc.nextLine();
		
		if(cusNumber == accountHolderDetails.getAccountNumber() && cusPass.equals(accountHolderDetails.getPassword())) {
			System.out.println("Current Balance : " + accountHolderDetails.getBalance());
		}
		else {
			System.out.println("Invalid Account Number or Password! Please Enter valid Details.");
		}
	}
	
	void deposite() {
		System.out.println("Enter Your Account Number : ");
		long cusNumber =sc.nextLong();
		sc.nextLine();
		System.out.println("Enter You Password : ");
		String cusPass = sc.nextLine();
		
		if(cusNumber == accountHolderDetails.getAccountNumber() && cusPass.equals(accountHolderDetails.getPassword())) {
			System.out.println("Enter Amount : ");
			double amount = sc.nextDouble();
			double deposite = accountHolderDetails.getBalance() + amount;
			accountHolderDetails.setBalance(deposite);
		}
		else {
			System.out.println("Invalid Account Number or Password! Please Enter valid Details.");
		}
	}
	
	void withdraw() {
		System.out.println("Enter Your Account Number : ");
		long cusNumber =sc.nextLong();
		sc.nextLine();
		System.out.println("Enter You Password : ");
		String cusPass = sc.nextLine();
		
		if(cusNumber == accountHolderDetails.getAccountNumber() && cusPass.equals(accountHolderDetails.getPassword())) {
			System.out.println("Enter Amount : ");
			double amount = sc.nextDouble();
			if(amount < accountHolderDetails.getBalance()) {
				double withdraw = accountHolderDetails.getBalance() - amount;
				accountHolderDetails.setBalance(withdraw);
			}
			else {
				System.out.println("Insufficient Balance or Amount Exceeds the limit");
			}
		}
		else {
			System.out.println("Invalid Account Number or Password! Please Enter valid Details.");
		}
	}
}

public class ATMSimulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		long accountNumber;
		String Password;
		double balance;
		
		System.out.println("Enter Your Name : ");
		name = sc.nextLine();
		System.out.println("Enter Your Account Number : ");
		accountNumber = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Your Password : ");
		Password = sc.nextLine();
		System.out.println("Enter Your Balance : ");
		balance = sc.nextDouble();
		
		int choice;
		
		AccountHolder achold = new AccountHolder(name, accountNumber, Password, balance);
		Services srv = new Services(achold);
		do {
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			
			System.out.print("Enter Your Choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
				case 1: srv.checkBalance();
					break;
				
				case 2:	srv.deposite();
					break;
				
				case 3 : srv.withdraw();
					break;
				
				case 4 : System.out.println("EXIT!");
					break;
				
				default:	System.out.println("Invalid Choice!");
					break;
			}
		}while(choice!=4);
	}
}
