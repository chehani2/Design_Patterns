package com.itechro.design_pattern;

public class LevelOneNotify extends FinalNotification {

    @Override
    protected void createNotifications() {
        notifications.add(new EmailNotification());
        notifications.add(new SMSNotification());
    }

    @Override
    public String toString() {
        return "LevelOneNotify{" +
                "notifications=" + notifications +
                '}';
    }
}
