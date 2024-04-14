package com.learning.lesson2.Calculator;

public class Calculator {
    // Function overloading

    //static function
    public static int add(int a, int b) { // No
        return a + b;
    }

    public static int add(int a, int b, int c) { // No
        return a + b + c;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }
}
