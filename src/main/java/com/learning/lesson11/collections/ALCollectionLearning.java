package com.learning.lesson11.collections;

import java.util.ArrayList;
import java.util.List;

public class ALCollectionLearning {

    // Collection it's a library which is build on data structure
    public static void main(String[] args) {
        int[] intArr = new int[20]; // X

        ArrayList<Integer> list = new ArrayList<>(); // Class in java collection
        list.add(10); // fast
        list.add(20); // fast
        list.add(30); // slow

        list.add(1, 40);

        list.removeLast();
        list.removeFirst();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);

        list.addAll(list1);

        if(list.contains(100)) {
            System.out.println("yes 100 is present");
        }

        for(Integer value: list) {
            System.out.println(value);
        }

        for(int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }

        ArrayList<Person> personArrayList = new ArrayList<>();
        Person p = new Person("Karan");
        personArrayList.add(p);
        personArrayList.add(new Person("Mohit"));

        List<Integer> list2 = new ArrayList<>();
    }
}
