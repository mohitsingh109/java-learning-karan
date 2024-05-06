package com.learning.lesson11.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollectionLearning {

    public static void main(String[] args) {

        // fast it's good to use for distinct & lockup
        // 1000
        // 100000
        // 10M
        Set<Integer> set = new HashSet<>(); // Hashing with tree
        set.add(10);
        set.add(40);
        set.add(20);
        // Average case fast
        // few cases super-fast
        // few cases Works worst

        for (Integer value: set) {
            System.out.println(value);
        }

        System.out.println(set.size());

        if(set.contains(40)) {
            // option
        }

        // function(Data: [int, string, person]) -> int(index)

        //arr: [_, _, _, Data, _, _]
        // add: arr[index] = Data
        // Contains: if(arr[index] != null) return true


        // it takes more memory (because of left right pointer)
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(20);
        treeSet.add(10);

        System.out.println("----------------");
        // inset delete update ( log2(N) N = number of node)

        // data stored in increasing order
        for(Integer value: treeSet) {
            System.out.println(value);
        }

        // it maintain the insertion order but hashset doesn't
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(40);
        linkedHashSet.add(20);

        System.out.println("-------------");
        for(Integer value: linkedHashSet) {
            System.out.println(value);
        }
    }
}
