package com.learning.lesson3.inheritance;


/**
 * Single Inheritance
 *
 * is a
 */
public class ElectricCar extends Car {

    private int batteryCapacity;

    public ElectricCar(String brand, int year, int batteryCapacity, String musicSystem) {
        super(brand, year, musicSystem); // parent constructor
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() + 50; // 250 + 50 = 300
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