package com.assignment_day_4_19_Feb_2026;

import java.util.Scanner;
public class Pattern3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int rows = sc.nextInt();
        
        for(int i = 1; i <= rows; i++){
            for(int j = 1 ; j <= i * 2; j++){
                System.out.print((j)++);
            }
            System.out.println();
        }
    }

}
