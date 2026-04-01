package com.assignment4Ques2;
import java.util.Scanner;




class Account{
	Scanner sc = new Scanner(System.in);
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	Account(){}
	
	Account(int accountNumber, String accountHolderName, double balance){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}

class SavingsAccount extends Account implements BankService{
	public void displayAccountDetails() {
		System.out.println("It is a Saving Account");
	}
	
	public double deposite(double amount) {
		System.out.println("Enter amount to deposite : ");
		String deposite = sc.next();
		double depositeAmount = Double.parseDouble(deposite);
		
		if(depositeAmount <= 0) {
			throw new NumberFormatException("Enter valid amount");
		}
		
		double newBalance = getBalance() + depositeAmount;
		setBalance(newBalance);
		return newBalance;
	}
	
	public double withdraw(double amount) {
		System.out.println("Enter amount to withdraw : ");
		String withdraw = sc.next();
		double withdrawAmount = Double.parseDouble(withdraw);
		
		if(withdrawAmount <= 0) {
			throw new NumberFormatException("Enter valid amount");
		}
		
		double newBalance = 0;
		if(withdrawAmount < getBalance()) {
			newBalance = getBalance() - withdrawAmount;
			setBalance(newBalance);
		}else {
			throw new IllegalArgumentException("Insufficient Balance");
		}
		return newBalance;
	}
	
	public double deposite(double amount, double bonus) {
		double newAmount;
		if(amount > 25000) {
			newAmount = amount + amount * bonus;
			setBalance(newAmount);
		}
		else {
			newAmount = amount;
		}
		
		return newAmount;
	}
	
	public String accountSummery() {
		StringBuffer sb = new StringBuffer();
		sb.append("===============Account Summary===============").append("\n");
		 sb.append(String.format("%-15s %-25s %-20s\n", "Account Number", "Holder Name", "Balance"));
		 sb.append("--------------------------------------------").append("\n");
				sb.append(String.format(
		                "%-5d %-15s ₹%-10.2f\n",
		               getAccountNumber(),
		               getAccountHolderName(),
		               getBalance()
		            ));
		sb.append("--------------------------------------------").append("\n");
		sb.append("Current Balance   :  ").append("₹").append(deposite(getBalance(), 0.10)).append("\n");
		sb.append("==================================").append("\n\n");
		
		return sb.toString();
	}
}

class CurrentAccount extends Account  implements BankService{
	
	
	
	public void displayAccountDetails() {
		System.out.println("It is a Current Account");
	}
	
	public double deposite(double amount) {
		System.out.println("Enter amount to deposite : ");
		String deposite = sc.next();
		double depositeAmount = Double.parseDouble(deposite);
		
		if(depositeAmount <= 0) {
			throw new NumberFormatException("Enter valid amount");
		}
		
		double newBalance =   getBalance() + depositeAmount;
		setBalance(newBalance);
		return newBalance;
	}
	
	public double withdraw(double amount) {
		System.out.println("Enter amount to withdraw : ");
		String withdraw = sc.next();
		double withdrawAmount = Double.parseDouble(withdraw);
		
		if(withdrawAmount <= 0) {
			throw new NumberFormatException("Enter valid amount");
		}
		
		double newBalance = 0;
		if(withdrawAmount < getBalance()) {
			newBalance = getBalance() - withdrawAmount;
			setBalance(newBalance);
		}else {
			throw new IllegalArgumentException("Insufficient Balance");
		}
		return newBalance;
	}
	
	public double deposite(double amount, double bonus) {
		double newAmount;
		if(getBalance() > 25000) {
			newAmount = getBalance() + getBalance() * bonus;
			setBalance(newAmount);
		}
		else {
			newAmount = amount;
		}
		
		return newAmount;
	}
	
	public String accountSummery() {
		StringBuffer sb = new StringBuffer();
		sb.append("===============Account Summary===============").append("\n");
		 sb.append(String.format("%-15s %-25s %-20s\n", "Account Number", "Holder Name", "Balance"));
		 sb.append("--------------------------------------------").append("\n");
				sb.append(String.format(
		                "%-5d %-15s ₹%-10.2f\n",
		               getAccountNumber(),
		               getAccountHolderName(),
		               getBalance()
		            ));
		sb.append("--------------------------------------------").append("\n");
		sb.append("Current Balance   :  ").append("₹").append(deposite(getBalance(), 0.10)).append("\n");
		sb.append("==================================").append("\n\n");
		
		return sb.toString();
	}
}

public class SmartBankingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 int choice;
		 SavingsAccount sa = new SavingsAccount();
		 CurrentAccount ca = new CurrentAccount();
		 
		 do {
			 
			 System.out.println("1. Create Account\n"
			 		+ "2. Deposite Money\n"
					 + "3. Withdraw money\n" +
			 		"4. Account Summery\n" + 
					 "5. EXIT");
			 
			 System.out.println("Enter a Choice : ");
			 choice = sc.nextInt();
			 
			 switch (choice) {
			case 1: System.out.print("Enter Account Number : ");
			 		int accountNumber = sc.nextInt();
			 		sa.setAccountNumber(accountNumber);
			 		ca.setAccountNumber(accountNumber);
			 	    
			 		System.out.print("Enter Name : ");
			 		String accountHolderName = sc.next();
			 		sa.setAccountHolderName(accountHolderName);
			 		ca.setAccountHolderName(accountHolderName);
			 
			 		System.out.print("Enter Balance : ");
			 		double balance = sc.nextDouble();
			 		sa.setBalance(balance);
			 		ca.setBalance(balance);
			 		
			 		Account ac = new Account(accountNumber, accountHolderName, balance);
			 	break;
			 	
			case 2:	System.out.println("Choose a account to depositr money : \n" + 
	 				"1. Saving Account\n" + "2. Current Account\n");
			 
					System.out.println("Enter Choice : ");
					choice = sc.nextInt();

					if(choice != 1 && choice != 2) {
						throw new NumberFormatException("Enter Valid Choice");
					}

					if(choice == 1) {
						sa.deposite(sa.getBalance());
					}
					else {
						ca.deposite(ca.getBalance());
					}
				break;

			case 3: System.out.println("Choose a account to withdraw money : \n" + 
	 				"1. Saving Account\n" + "2. Current Account\n");
			 
					System.out.println("Enter Choice : ");
					 choice = sc.nextInt();
			
					 if(choice != 1 && choice != 2) {
						 throw new NumberFormatException("Enter Valid Choice");
					 }
			
					 if(choice == 1) {
						 sa.withdraw(sa.getBalance());
					 }
					 else {
						 ca.withdraw(ca.getBalance());
					 }
				break;

			case 4:	 System.out.println("Choose a account for summary : \n" + 
	 				"1. Saving Account\n" + "2. Current Account\n");
			 
					 System.out.println("Enter Choice : ");
					 choice = sc.nextInt();
			
					 if(choice != 1 && choice != 2) {
						 throw new NumberFormatException("Enter Valid Choice");
					 }
			
					 if(choice == 1) {
						 System.out.println(sa.accountSummery());
					 }
					 else {
						 System.out.println(ca.accountSummery());
					 }
				break;
					 
			case 5:	System.out.println("EXIT!");
			 break;
			 
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
	}while(choice!=5);

}
}