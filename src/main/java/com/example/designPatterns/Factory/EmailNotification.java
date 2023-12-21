package com.example.designPatterns.Factory;

public class EmailNotification implements Notification{
    @Override
    public void alertUser() {
        System.out.println("Sending an email");
    }
}
