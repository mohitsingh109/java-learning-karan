package com.learning.lesson2.classesandobjects;

public class Main {

    public static void main(String[] args) { // JVM
        //DT VN = new DT();
        com.learning.lesson2.classesandobjects.Person karan = new com.learning.lesson2.classesandobjects.Person("Karan", 10, "M", 1234, 1234); // creating a object
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

