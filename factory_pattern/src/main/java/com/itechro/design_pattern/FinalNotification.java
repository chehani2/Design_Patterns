package com.itechro.design_pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class FinalNotification {

    protected List<Notification> notifications = new ArrayList<>();

    public FinalNotification() {
        this.createNotifications();
    }

    protected abstract void createNotifications();
}
