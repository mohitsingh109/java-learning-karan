package com.learning.lesson3.inheritance;

public class Main {
    public static void main(String[] args) {
       Car electricCar = new ElectricCar("Tesla", 2015, 30, "Sony");
       Car tesla = new Tesla("Tesla S1", 2015, 23, "Sony","Abc");
       tesla.setRadio(true);
       tesla.changeGear(); // Car Tesla?
        electricCar.changeGear(); // car
        System.out.println(tesla.calculatePrice());
        tesla.ai();

    }
}

