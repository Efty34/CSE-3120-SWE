package org.example;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world!");
    }
}

