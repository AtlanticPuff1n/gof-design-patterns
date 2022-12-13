package com.patterns.design.gof.creational.singleton.lazy_singleton;

public class LazySingletonDemo {
    public static void main(String[] args) {
        LazySingleton singletonOne = LazySingleton.getInstance();
        LazySingleton singletonTwo = LazySingleton.getInstance();
        System.out.println(singletonOne);
        System.out.println(singletonTwo);
    }
}
