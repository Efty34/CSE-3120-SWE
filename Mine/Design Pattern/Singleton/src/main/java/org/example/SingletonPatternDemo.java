package org.example;

public class SingletonPatternDemo {
    public static void main(String[] args){
        SingletonEager singletonEager = SingletonEager.getInstance();
        singletonEager.showMessage();

        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);

        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println(singletonLazy2);
    }
}
