package com.learning.leasson10.generics;

public class Main {
    public static void main(String[] args) {
        Test<Integer, String> test = new Test<>(10, "Karan");
        Test<Double, Integer> testDouble = new Test<>(10.4, 49);
    }
}
