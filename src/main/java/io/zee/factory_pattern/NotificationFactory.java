package io.zee.factory_pattern;

public class NotificationFactory {

    public static FinalNotification createFInalNotification(String type) {
        switch (type) {
            case "BASIC":
                return new BasicNotify();
            case "LEVEL_ONE":
                return new LevelOneNotify();
            case "LEVEL_TWO":
                return new LevelTwoNotify();
            default:
                return null;
        }
    }
}
