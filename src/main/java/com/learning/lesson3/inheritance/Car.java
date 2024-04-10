package com.learning.lesson3.inheritance;

public class Car {

    private String brand;

    private int year;

   // private String fuelType;

    //private int numberOfDoor;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        //this.fuelType = fuelType;
    }

//    public Car() {
//        System.out.println("Car constructor");
//    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

//    public String getFuelType() {
//        return fuelType;
//    }
//
//    public void setFuelType(String fuelType) {
//        this.fuelType = fuelType;
//    }
}
