package com.patterns.design.gof.behavioral.strategy;

public class PaymentByCreditCard implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " by Credit Card");
    }
}
