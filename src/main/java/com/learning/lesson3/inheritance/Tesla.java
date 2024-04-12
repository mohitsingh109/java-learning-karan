package com.learning.lesson3.inheritance;

/**
 *  Multilevel Inheritance
 *  Car(P) ---> Electric Car(C) ---> Tesla(C)
 *
 */
public class Tesla extends ElectricCar{
    private String name;


    public Tesla(String brand, int year, int batteryCapecity, String musicSystem, String name) {
        super(brand, year, batteryCapecity, musicSystem);
        this.name = name;
    }

//    public void myCustomChangeGear() {
//        System.out.println("Tesla change gear");
//    }

    @Override
    public void changeGear(){
        System.out.println("Tesla change gear");
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() + 10; // 300 + 10
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
