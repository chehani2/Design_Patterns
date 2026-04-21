package com.itechro.design_pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FinalNotification aNotification = NotificationFactory.createFInalNotification("BASIC");
        System.out.println(aNotification);

        FinalNotification bNotification = NotificationFactory.createFInalNotification("LEVEL_ONE");
        System.out.println(bNotification);

    }
}