package com.learning.lesson5.abstraction;

public class Main {

    public static void main(String[] args) {
        Phone iPhone = new IPhone("Iphone", 2015, "12 Pro");
        iPhone.captureImage();
        iPhone.displayUI();

        Phone samsung = new Samsung("Samsung s22", 2023);
        samsung.captureImage();
        samsung.displayUI();
    }
}
