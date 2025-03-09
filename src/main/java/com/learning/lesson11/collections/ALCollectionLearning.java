package com.learning.lesson11.collections;

import java.util.ArrayList;
import java.util.List;

public class ALCollectionLearning {

    // Collection it's a library which is build on data structure
    public static void main(String[] args) {
        int[] intArr = new int[20]; // X

        List<Integer> list = new ArrayList<>(); // Class in java collection
        list.add(10); // fast
        list.add(20); // fast

        list.add(30); // slow
        // 10, 20, 30

        list.add(1, 40); // slow

        list.removeLast();
        list.removeFirst();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);

        list.addAll(list1);

        if(list.contains(100)) {
            System.out.println("yes 100 is present");
        }

        for(Integer value: list) { // for each loop
            System.out.println(value);
        }

        // [10, 20, 30, 40] = 4
        //  0,  1,   2,  3
        for(int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index)); // 10
        }

        ArrayList<Person> personArrayList = new ArrayList<>();

        Person p = new Person("Karan");
        personArrayList.add(p);

        personArrayList.add(new Person("Mohit"));

        List<Integer> list2 = new ArrayList<>();
    }
}
