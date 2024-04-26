package com.learning.leasson7.string;

import java.time.Instant;

public class Main {

    public static void main(String[] args) {
        String name = "Karan"; // new String("karan");
        char[] name1 = {'K', 'a', 'r', 'a', 'n'}; // yes

        name = "Hello " + name; // costly operation
        //char[] name1 = {'H', 'e', 'l', 'l', 'o',' ', K', 'a', 'r', 'a', 'n'};
        System.out.println(name);

        StringBuilder stringBuilder = new StringBuilder();
        //char[] name1 = new char[100];
        stringBuilder.append("Karan");
        // name1 = {'K', 'a', 'r', 'a', 'n', ' ',........};
        stringBuilder.append(" ");

        // String
        System.out.println("start");
        Long start = Instant.now().toEpochMilli();
        String value = "";
        for(int i = 0; i < 1000000; i++) {
            //value = value + i + "sdklfdsklgdsklghdsklghdskghdskghksdhgdskghdskghdsklhgdsklghdsklg";
        }
        Long end = Instant.now().toEpochMilli();
        System.out.println(end - start); //
        System.out.println("end");

        ////////////////////////////////////////////////////////
        System.out.println("start sb");
        StringBuilder stringBuilder1 = new StringBuilder();
        start = Instant.now().toEpochMilli();
        for(int i = 0; i < 1000000; i++) {
            stringBuilder1.append(i).append("sdklfdsklgdsklghdsklghdskghdskghksdhgdskghdskghdsklhgdsklghdsklg");
            //value = value + i + "sdklfdsklgdsklghdsklghdskghdskghksdhgdskghdskghdsklhgdsklghdsklg";
        }

        end = Instant.now().toEpochMilli();
        System.out.println(end - start);
        System.out.println("end sb");
        ////////////////////////////////////////////////////////

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

        //
    }
}
