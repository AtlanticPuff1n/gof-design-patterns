package com.patterns.design.gof.creational.singleton.thread_safe_singleton;

public class ThreadSafeSingletonDemo {
    public static void main(String[] args) {
        ThreadSafeSingleton singletonOne = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton singletonTwo = ThreadSafeSingleton.getInstance();
        System.out.println(singletonOne);
        System.out.println(singletonTwo);
    }
}
