package com.example.designPatterns.Factory;

public class NotificationFactory {
    public static  Notification createNotification(String notificationType){
        if(notificationType.equals("SMS"))
            return new SMSNotification();
        else if(notificationType.equals("EMAIL"))
            return  new EmailNotification();
        else if(notificationType.equals("PUSH"))
            return new PushNotification();
        else
            throw new RuntimeException("Notification type invalid");
    }
}
