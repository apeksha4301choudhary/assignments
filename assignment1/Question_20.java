package com.assignment1;
/*
 
1
12
123
1234
 
 */
public class Question_20 {
	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++) {
			int count = 1;
			for(int j = 1; j <= i; j++) {
				System.out.print(count++);
			}
			System.out.println();
		}
	}
}
