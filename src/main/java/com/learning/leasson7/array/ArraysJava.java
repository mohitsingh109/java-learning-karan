package com.learning.leasson7.array;

import com.learning.lesson4.polymorphism.Employee;
import com.learning.lesson4.polymorphism.JavaDeveloper;

import java.util.ArrayList;
import java.util.List;

public class ArraysJava {

    public static void main(String[] args) {

        // you can't create array without size
        // continue memory block
        int[] arr1 = {10, 20, 30};
        int[] arr = new int[2]; // default 0
        arr[0] = 1;
        arr[1] = 3;

        // add 5

        int[] tmp = new int[arr.length * 2]; // {1, 3, 5, 10}
        for(int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[2] = 5;
        arr = tmp;
        arr[3] = 10;

        //List<Integer> arr1 = new ArrayList<>();
        for(int value: tmp) {
            System.out.println(value);
        }

        int[][] arr2 = new int[2][2];
        arr2[1][1] = 10;

        for(int i = 0; i < arr2.length; i++) { // row
            for(int j = 0; j < arr2[i].length; j++) { // column
                System.out.println(arr2[i][j]);
            }
        }

        Employee[] employees = new Employee[2];
        //List<Employee> arr1 = new ArrayList<>();
        JavaDeveloper[] javaDeveloper = new JavaDeveloper[2];
        //List<JavaDeveloper> arr1 = new ArrayList<>();
    }
}
