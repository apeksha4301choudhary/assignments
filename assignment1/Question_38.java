package com.assignment1;
//	Create a number guessing game.

import java.util.Scanner;
import java.util.Random;
public class Question_38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(100) + 1; // 1 to 100
        int guess;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > target) {
                System.out.println("Too High");
            } else if (guess < target) {
                System.out.println("Too Low");
            } else {
                System.out.println("Correct! Attempts: " + attempts);
            }

        } while (guess != target);

        sc.close();
    }
}