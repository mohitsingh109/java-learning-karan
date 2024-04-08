package com.learning.lesson1.operatorsandexpressions;

public class Main {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Arithmetic operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Relational operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreaterThan = (a > b);
        boolean isLessThan = (a < b);
        boolean isGreaterThanOrEqual = (a >= b);
        boolean isLessThanOrEqual = (a <= b);

        System.out.println("\nRelational operations:");
        System.out.println("Is equal: " + isEqual);
        System.out.println("Is not equal: " + isNotEqual);
        System.out.println("Is greater than: " + isGreaterThan);
        System.out.println("Is less than: " + isLessThan);
        System.out.println("Is greater than or equal: " + isGreaterThanOrEqual);
        System.out.println("Is less than or equal: " + isLessThanOrEqual);

        // Logical operators
        boolean x = true;
        boolean y = false;
        boolean andResult = x && y;
        boolean orResult = x || y;
        boolean notResult = !x;

        System.out.println("\nLogical operations:");
        System.out.println("AND: " + andResult);
        System.out.println("OR: " + orResult);
        System.out.println("NOT: " + notResult);
    }
}
