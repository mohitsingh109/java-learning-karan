package com.learning.lesson1.controlflowstatements;

public class Main {
    public static void main(String[] args) {
        // If-else statement
        int x = 10;
        if (x > 0) {
            System.out.println("x is positive.");
        } else if (x < 0) {
            System.out.println("x is negative.");
        } else {
            System.out.println("x is zero.");
        }

        // Switch statement
        int day = 3;
        String dayString;
        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
        }
        System.out.println("Day of the week: " + dayString);

        // For loop
        System.out.println("\nFor loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // While loop
        System.out.println("\nWhile loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration " + j);
            j++;
        }

        // Do-while loop
        System.out.println("\nDo-while loop:");
        int k = 1;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k <= 5);

        // Break statement
        System.out.println("\nBreak statement:");
        for (int m = 1; m <= 10; m++) {
            if (m == 6) {
                break;
            }
            System.out.println("Iteration " + m);
        }

        // Continue statement
        System.out.println("\nContinue statement:");
        for (int n = 1; n <= 5; n++) {
            if (n == 3) {
                continue;
            }
            System.out.println("Iteration " + n);
        }

        // Return statement
        System.out.println("\nReturn statement:");
        int result = calculateSum(5, 3);
        System.out.println("Sum: " + result);
    }

    // Method to calculate the sum
    public static int calculateSum(int a, int b) {
        return a + b;
    }
}
