package com.patterns.design.gof.creational.prototype;

abstract class Shape {
    private String color;

    public Shape(){}

    public Shape(Shape shape) {
        this.color = shape.color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract Shape clone();
}
