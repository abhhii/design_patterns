package com.example.designPatterns.Factory;

public class SMSNotification implements Notification{
    @Override
    public void alertUser() {
        System.out.println("Sending a SMS");
    }
}
