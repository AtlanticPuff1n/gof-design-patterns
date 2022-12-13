package com.patterns.design.gof.creational.prototype;

public class Circle extends Shape{

    private int radius;

    public Circle(){}

    public Circle(Circle circle){
        super(circle);
        this.radius = circle.radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                '}';
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
