package com.patterns.design.gof.behavioral.strategy;

public class PaymentByPayPal implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " by PayPal");
    }
}
