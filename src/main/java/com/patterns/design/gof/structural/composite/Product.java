package com.patterns.design.gof.structural.composite;

public abstract class Product implements Box{
    private final String title;
    private final double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
