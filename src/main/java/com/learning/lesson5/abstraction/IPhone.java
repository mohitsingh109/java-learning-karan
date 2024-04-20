package com.learning.lesson5.abstraction;

public class IPhone extends Phone {

    private String modelNumber;

    public IPhone(String name, int year, String modelNumber) {
        super(name, year);
        this.modelNumber = modelNumber;
    }

    @Override
    public void displayUI() {
        System.out.println("Iphone UI");
    }

    @Override
    public void captureImage() {
        System.out.println("Iphone click Image");
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }
}
