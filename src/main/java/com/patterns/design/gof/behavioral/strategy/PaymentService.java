package com.patterns.design.gof.behavioral.strategy;

public class PaymentService {
    private double cost;
    private boolean isDeliveryIncluded;
    private PaymentStrategy paymentStrategy;

    public PaymentService(double cost, boolean isDeliveryIncluded, PaymentStrategy paymentStrategy) {
        this.cost = cost;
        this.isDeliveryIncluded = isDeliveryIncluded;
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder() {
        paymentStrategy.pay(getTotal());
    }

    public double getTotal() {
        return isDeliveryIncluded
                ? cost + 10
                : cost;
    }
}
