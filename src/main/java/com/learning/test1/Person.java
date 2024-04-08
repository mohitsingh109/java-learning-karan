package com.learning.test1;


//AM (public or default)
public class Person {
    // AM (public, private, protacted, default)
    private String name; // Data members
    private int age; // Data members
    private String gender; // Data members
    private int accountNo; // Data member
    private int atmPin; // Data member


    // constructor
    //AM (default, private, public)
    //AM ClassName(){}
    public Person(String name, int age, String gender, int accountNo, int atmPin){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.accountNo = accountNo;
        this.atmPin = atmPin;
    }


    public void addAmount(String userName, double amount) {

    }




    //AM RT FN FA
    public void printPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

