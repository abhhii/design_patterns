package com.example.designPatterns.Factory;

public class PushNotification implements Notification{
    @Override
    public void alertUser() {
        System.out.print("Sending a push notification");
    }
}
