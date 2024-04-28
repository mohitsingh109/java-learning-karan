package com.learning.leasson8.interfacess.example2;

public class Sms implements Notification, GetNotification{

    private String phoneNumber;

    public Sms(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification(String text) {
        System.out.println("Sending text to :" + phoneNumber);
    }

    @Override
    public String getNotification() {
        return "Some text";
    }
}
