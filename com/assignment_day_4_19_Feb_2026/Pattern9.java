package com.assignment_day_4_19_Feb_2026;

import java.util.Scanner;
public class Pattern9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int rows = sc.nextInt();
        
        int count = 1;
        for(int i = 1; i <= rows; i++){
            for(int j = rows ; j > i; j--){
                System.out.print(" ");
            }
            
            
            for(int j = 1; j <= i; j++){
                System.out.print("*");
                if(j < i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
        for(int i = 1; i <= rows; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(" ");
            }
            
            
            for(int j = rows - 1; j >= i; j--){
                System.out.print("*");
                if(j > i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


}
