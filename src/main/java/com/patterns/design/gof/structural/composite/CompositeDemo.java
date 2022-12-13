package com.patterns.design.gof.structural.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();

        deliveryService.setupOrder(
                new CompositeBox(
                        new Book("GOF", 25.99)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Book("Spring Boot", 219.99),
                                new Book("FF", 10.99)
                        ),
                        new Chair("Gaming Chair", 219.99)
                )
        );

        System.out.println(deliveryService.calculateOrderPrice());
    }
}
