package com.learning.leasson7.string;

public class Main {

    public static void main(String[] args) {
        String name = "Karan";
        char[] name1 = {'K', 'a', 'r', 'a', 'n'};

        System.out.println(name);

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        String empty = "";
        String blank = "    ";

        if(empty.isEmpty()) {
            System.out.println("It's an empty string");
        }

        if(blank.isBlank()) {
            System.out.println("It's a blank string");
        }

        name = "Hello " + name;
        System.out.println(name);

        if(name.contains("an")) {
            System.out.println("yes an is present");
        }

        if(name.equals("Hello Karan")) {
            System.out.println("Yes both string are equal");
        }

        if(name.equalsIgnoreCase("hello karan")) {
            System.out.println("equalsIgnoreCase Yes both string are equal");
        }

        if(name.startsWith("Hello")) {
            System.out.println("Yes hello is present in name start with");
        }

        if(name.endsWith("Karan")) {
            System.out.println("Yes karan is present in the end");
        }

        String names = "Mohit,Karan,Rohit";
        String[] listOfName = names.split(","); // {"Mohit", "Karan", "Rohit"}

        for(int i = 0; i < listOfName.length; i++) {
            System.out.println(listOfName[i].length()); //"Mohit".length()
        }

        // for each loop
        for(String n: listOfName) {
            System.out.println(n);
        }

        int [] arr1 = {10, 20};
        for(int a: arr1) {
            System.out.println(a);
        }

    }
}
