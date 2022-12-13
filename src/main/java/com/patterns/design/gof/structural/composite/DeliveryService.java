package com.patterns.design.gof.structural.composite;

public class DeliveryService {
    private Box box;

    public void setupOrder(Box... boxes) {
        box = new CompositeBox(boxes);
    }

    public double calculateOrderPrice() {
        return box.calculatePrice();
    }
}
