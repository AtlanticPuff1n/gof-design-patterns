package com.patterns.design.gof.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setColor("Red")
                .setEngine("V8")
                .setSeats(2)
                .build();

        System.out.println(car.toString());
    }
}
