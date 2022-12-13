package com.patterns.design.gof.behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategyByPayPal = new PaymentByPayPal();
        PaymentService paymentServiceWithPayPal = new PaymentService(20, true, paymentStrategyByPayPal);
        paymentServiceWithPayPal.processOrder();

        PaymentStrategy paymentStrategyByCreditCard = new PaymentByCreditCard();
        PaymentService paymentServiceWithCreditCard = new PaymentService(10, false, paymentStrategyByCreditCard);
        paymentServiceWithCreditCard.processOrder();
    }
}
