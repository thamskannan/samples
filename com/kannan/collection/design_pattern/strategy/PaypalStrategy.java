package com.kannan.collection.design_pattern.strategy;

/**
 * @author Kannan Dharmalingam
 */
public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(long amount) {
        System.out.println(amount + " payed through paypal");
    }
}
