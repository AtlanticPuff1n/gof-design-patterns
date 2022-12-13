package com.patterns.design.gof.creational.prototype;

public class Rectangle extends Shape {
    private int y;
    private int x;

    public Rectangle(){}

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.y = rectangle.y;
        this.x = rectangle.x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "y=" + getY() +
                ", x=" + getX() +
                ", color='" + getColor() + '\'' +
                '}';
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
