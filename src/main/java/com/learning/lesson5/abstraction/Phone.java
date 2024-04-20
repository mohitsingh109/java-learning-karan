package com.learning.lesson5.abstraction;

public abstract class Phone { // abstract method

    private String name;

    private int year;

    public Phone(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public abstract void displayUI(); // abstract method


    public abstract void captureImage(); // abstract method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
