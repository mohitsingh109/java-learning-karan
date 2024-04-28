package com.learning.leasson8.interfacess.example2;

public class Main {

    public static void main(String[] args) {
        //Assignment       = // Object Creation
        Notification karan = new Sms("7888770232");
        karan.sendNotification("Some text"); // SMS

        GetNotification email = new Email("test@gmail.com");
        email.getNotification();
    }
}
