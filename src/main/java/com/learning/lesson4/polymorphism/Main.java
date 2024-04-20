package com.learning.lesson4.polymorphism;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager("Karan", 10, 5, "FedRamp");
        JavaDeveloper javaDeveloper = new JavaDeveloper("Mohit", 35, "11");
        // Hr.java
        // Svp.java
        // 1000.... (Mix of all type of employee)

        // Run time Polymorphism
        // Security (99%)
        //    Reduce the scope
        //    Easy to access

        manager.addBonus(10); // 10 + 10?
        manager.showTeamSalary(); // yes
        javaDeveloper.addBonus(10);
        //1000....


        //Employee[] list  = sql("select * from employee"); // HR, SVP, Java
        //Run time Polymorphism (Parent can handle child object)
        Employee[] list = {manager, javaDeveloper};

        Employee employee = new Employee("Test", 20);


        for (Employee e: list) {
            e.addBonus(5);
            //e.showTeamSalary();
        }

        // Employee manager1 = sql("select * from manager where id = 5");
        Employee manager1 = new Manager("Mohit", 10, 5, "FedRamp");

        printEmployeeDetails(manager1); // yes
        printEmployeeDetails(manager); // Yes Security
        printEmployeeDetails(javaDeveloper); // Yes
    }

    public static void printEmployeeDetails(Employee employee) {
        System.out.println(employee.getName());
    }
}
