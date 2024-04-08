package com.learning.lesson2.classesandobjects;

public class Main {

    public static void main(String[] args) { // JVM
        //DT VN = new DT();
        Person karan = new Person("Karan", 10, "M", 1234, 1234); // creating a object

        String name = karan.getName();

        Person temp2 = new Person("Karan", 10, null, 1234, 1234); // creating a object

        Person temp = new Person(12345, 2345);
        temp.setName("Mohit");
        temp.setAge(25);

        Person temp3 = new Person();
        //DT VN = Value
        int abc = 10;

//        karan.name = "Karan";
//        karan.age = 10;
//        karan.gender = "M";
//        karan.accountNo = "1234";
//        karan.atmPin = "1234";


        karan.printPerson();

        //Person mohit = new Person();
//        mohit.name = "Mohit";
//
//        karan.accountNo = "hack";
//        karan.atmPin = "2345";
    }
}

