package com.learning.lesson3.inheritance;

/**
 *  Multilevel Inheritance
 *  Car(P) ---> Electric Car(C) ---> Tesla(C)
 *
 */
public class Tesla extends ElectricCar{

    private String name;

    public Tesla(String brand, int year, int batteryCapecity, String name) {
        super(brand, year, batteryCapecity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
