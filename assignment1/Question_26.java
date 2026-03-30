package com.assignment1;
// Write a program to check whether a number is Armstrong.

public class Question_26 {
	public static void main(String[] args) {
		int num = 153;
		int count  = 0;
		int num_num = num;
		int armstrong = 0;
		int temp = num;
		
		while(temp!=0) {
			int digit = temp%10;
			temp = temp/10;
			count++;
		}
		
		while(num_num!=0) {
			int digit = num_num%10;
			
			int power = 1;
			for(int i = 1; i <= count; i++) {
				power *= digit;
			}
			
			armstrong += power;
			num_num = num_num/10;
		}
		
		if(armstrong == num) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
		
	}
}
