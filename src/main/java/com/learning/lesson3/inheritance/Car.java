package com.learning.lesson3.inheritance;

public class Car {

    private String brand;

    private int year;

    private String musicSystem;

    private boolean radio;

    private double price = 250;

   // private String fuelType;

    //private int numberOfDoor;


    public Car(String brand, int year, String musicSystem) {
        this.brand = brand;
        this.year = year;
        this.musicSystem = musicSystem;
        //this.fuelType = fuelType;
    }

    public Car(String brand, int year) {
        this(brand, year, null);
    }

    public void ai() {
        System.out.println("f1");
        System.out.println("f2");
        System.out.println("f3");
    }

    public void changeGear() {
        System.out.println("Change gear");
    }

    public double calculatePrice() {
        return price;
    }


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


    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }
}
