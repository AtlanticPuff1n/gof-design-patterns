package com.patterns.design.gof.structural.composite;

public class Chair extends Product{
    public Chair(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
