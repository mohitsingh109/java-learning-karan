package com.learning.lesson9.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionLearning {

    public static void f1() throws FileNotFoundException {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj); // FileNotFoundException
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("File not present");
            throw e; // navigate to calling function
        }
    }

    public static void f2() throws CustomCheckedException {
        String hello = "Hello World";

        //....

        if(hello.contains("W")) {
            throw new CustomCheckedException("hello string should not contain W");
        }

    }

    public static void f3() {
        String karan = "Karan";

        if(karan.contains("z")) {
            throw new CustomUnCheckedException("Karan contains z is invalid");
        }
    }

    public static void f4(String name) {

        if(name == null) {
            throw new NullPointerException();
        }

        if(name.isBlank()) {
            throw new IllegalArgumentException("Name is blank");
        }
    }
}

// UI(error) ---> Spring (GET /api/data)