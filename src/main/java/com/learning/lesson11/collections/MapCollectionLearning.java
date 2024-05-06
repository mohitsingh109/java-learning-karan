package com.learning.lesson11.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollectionLearning {

    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>(); // 100 %
        hashMap.put("Rohit", "Hi I am Rohit");
        hashMap.put("Mohit", "Hi I am Mohit");
        hashMap.put("Karan", "Hi I am Karan");
        hashMap.put("Ankit", "Hi I am Ankit");

        String value = hashMap.get("Karan"); // lockup
        System.out.println(value);

        //MySQl
        //Mongo DB
        //Kafka
        //Redex is a query builder
        boolean containsMohit = hashMap.containsKey("Mohit");
        System.out.println(containsMohit);

        boolean containsValueABC = hashMap.containsValue("ABC"); // O(N)
        System.out.println(containsValueABC);

        System.out.println("-------------");
        for(Map.Entry<String, String> entry: hashMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("-------------");
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Rohit", "Hi I am Rohit");
        linkedHashMap.put("Mohit", "Hi I am Mohit");
        linkedHashMap.put("Karan", "Hi I am Karan");
        linkedHashMap.put("Ankit", "Hi I am Ankit");

        for(Map.Entry<String, String> entry: linkedHashMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // DT vn
        // Student abc;

        // Use it if hashMap is not performant
        TreeMap<String, String> treeMap = new TreeMap<>();
        // inset delete update ( log2(N) N = number of node)
        treeMap.put("Rohit", "Hi I am Rohit");
        treeMap.put("Mohit", "Hi I am Mohit");
        treeMap.put("Karan", "Hi I am Karan");
        treeMap.put("Ankit", "Hi I am Ankit");
    }
}
