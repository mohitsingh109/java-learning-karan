package com.learning.lesson4.polymorphism;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager("Karan", 10, 5, "FedRamp");
        JavaDeveloper javaDeveloper = new JavaDeveloper("Mohit", 35, "11");
        // Hr.java
        // Svp.java
        // 1000.... (Mix of all type of employee)
        // Run time Polymorphism
        // Security
        // Reduce the scope
        // Easy to access

        manager.addBonus(10);
        javaDeveloper.addBonus(10);
        //1000....


        String[] employee = {manager.getName(), javaDeveloper.getName()};

        //Employee[] list  = sql("select * from employee"); // HR, SVP, Java
        //Run time Polymorphism (Parent can handle child object)
        Employee[] list = {manager, javaDeveloper};

        for (Employee e: list) {
            e.addBonus(5);
        }

        int[] value = {10, 20, 30};

//        for(int v: value) { // for each loop
//            System.out.println(v);
//        }
    }
}
