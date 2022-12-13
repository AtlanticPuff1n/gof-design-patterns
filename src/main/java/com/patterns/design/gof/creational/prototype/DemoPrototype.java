package com.patterns.design.gof.creational.prototype;

public class DemoPrototype {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setX(22);
        rectangle.setY(31);
        rectangle.setColor("green");
        Rectangle rectangle1 = (Rectangle) rectangle.clone();
        System.out.println(rectangle1.toString());

        Circle circle = new Circle();
        circle.setColor("red");
        circle.setRadius(10);
        Circle circle1 = (Circle) circle.clone();
        System.out.println(circle1.toString());
    }
}
