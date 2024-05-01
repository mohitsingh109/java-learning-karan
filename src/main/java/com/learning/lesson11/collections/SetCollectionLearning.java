package com.learning.lesson11.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetCollectionLearning {

    public static void main(String[] args) {

        // fast it's good to use for distinct & lockup
        HashSet<Integer> set = new HashSet<>(); // Hashing with tree
        set.add(10);
        set.add(20);
        set.add(40);

        for (Integer value: set) {
            System.out.println(value);
        }

        if(set.contains(40)) {
            // option
        }

    }
}
