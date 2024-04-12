package com.learning.lesson3.inheritance;


/**
 *  Hierarchical Inheritance
 *  Car(P) ---> Electric Car(C) ---> Tesla(C)
 *                              ---> Tata(C)
 * Hybrid Inheritance
 *
 */
public class Tata extends ElectricCar{

    private String tataAiVersion;

    public Tata(String brand, int year, int batteryCapecity, String musicSystem, String tataAiVersion) {
        super(brand, year, batteryCapecity, musicSystem);
        this.tataAiVersion = tataAiVersion;
    }

    public String getTataAiVersion() {
        return tataAiVersion;
    }

    public void setTataAiVersion(String tataAiVersion) {
        this.tataAiVersion = tataAiVersion;
    }
}
