package com.patterns.design.gof.creational.singleton.eager_singleton;

import com.patterns.design.gof.creational.singleton.lazy_singleton.LazySingleton;

public class EagerSingletonDemo {
    public static void main(String[] args) {
        EagerSingleton singletonOne = EagerSingleton.getInstance();
        EagerSingleton singletonTwo = EagerSingleton.getInstance();
        System.out.println(singletonOne);
        System.out.println(singletonTwo);
    }
}
