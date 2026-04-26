package io.zee.factory_pattern;

public class BasicNotify extends FinalNotification {

    @Override
    protected void createNotifications() {
        notifications.add(new EmailNotification());
    }

    @Override
    public String toString() {
        return "BasicNotify{" +
                "notifications=" + notifications +
                '}';
    }

}
