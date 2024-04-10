package com.learning.lesson3.inheritance;


/**
 * Single Inheritance
 *
 * is a
 */
public class ElectricCar extends Car {

    private int batteryCapacity;

    public ElectricCar(String brand, int year, int batteryCapacity) {
        super(brand, year); // parent constructor
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}

/**
 * Car(P) ---> Electric Car(C)
 *
 *
 *
 */