package com.itechro.design_pattern;

public class LevelTwoNotify extends FinalNotification {

    @Override
    protected void createNotifications() {
        notifications.add(new EmailNotification());
        notifications.add(new SMSNotification());
        notifications.add(new PushNotification());
    }

    @Override
    public String toString() {
        return "LevelTwoNotify{" +
                "notifications=" + notifications +
                '}';
    }
}
