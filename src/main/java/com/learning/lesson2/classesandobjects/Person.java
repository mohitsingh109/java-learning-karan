package com.learning.lesson2.classesandobjects;


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
    //All Arg Constructor
    public Person(String name, int age, String gender, int accountNo, int atmPin){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.accountNo = accountNo;
        this.atmPin = atmPin;
    }

    public Person(int accountNo, int atmPin) {
       this(null, 0, null, accountNo, atmPin);
    }

    //default constructor
    public Person() {}


    public void addAmount(String userName, double amount) {

    }

    //AM RT FN FA
    public void printPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    //getter & setter

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

