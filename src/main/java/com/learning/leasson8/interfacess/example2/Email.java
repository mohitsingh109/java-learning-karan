package com.learning.leasson8.interfacess.example2;

public class Email implements Notification, GetNotification{

    private String id;

    public Email(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void sendNotification(String text) {
        System.out.println("send text to id: " + id);
    }

    @Override
    public String getNotification() {
        return "Some text";
    }
}
