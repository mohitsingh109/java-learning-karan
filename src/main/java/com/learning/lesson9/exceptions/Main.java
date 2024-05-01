package com.learning.lesson9.exceptions;

import java.io.FileNotFoundException;

public class Main {

    // 1) Checked Exception
    // json, .txt IOException
    // 2) Unchecked Exception (Prefer)

    public static void main(String[] args) {
        try {
            ExceptionLearning.f1();
            ExceptionLearning.f2();
            //...
        } catch (FileNotFoundException | CustomCheckedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            // it will aAlways call either exception raised or not
            //db.close();
            //sendNotification();
            //clean Up
        }
    }
}
//f1(handle) ---> f2(handle) ---> f3(handle) --->f4(Checked Exception)