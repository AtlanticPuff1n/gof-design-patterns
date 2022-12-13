package com.patterns.design.gof.creational.singleton.thread_safe_singleton;

public class ThreadSafeSingleton {
    private ThreadSafeSingleton() {}

    private static class LazyHolder {
        static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();
    }

    public static ThreadSafeSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}


