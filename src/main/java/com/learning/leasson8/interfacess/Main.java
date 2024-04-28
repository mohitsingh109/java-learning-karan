package com.learning.leasson8.interfacess;

public class Main {

    public static void main(String[] args) {
        Hr hr = new Hr("Neha", "neha@gmail.com", "123456", 44.5);
        displayDetails(hr);
    }

    public static void displayDetails(AccountDetails ad) {
        ad.getSalary();
    }

}
