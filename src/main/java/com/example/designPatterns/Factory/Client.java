package com.example.designPatterns.Factory;

public class Client {
    public static void main(String[] args){
        Notification sms = NotificationFactory.createNotification("SMS");
        Notification email = NotificationFactory.createNotification("EMAIL");
        Notification push = NotificationFactory.createNotification("PUSH");

        sms.alertUser();
        email.alertUser();
        push.alertUser();
    }
}
