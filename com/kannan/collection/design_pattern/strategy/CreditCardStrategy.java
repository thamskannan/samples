package com.kannan.collection.design_pattern.strategy;

/**
 * @author Kannan Dharmalingam
 */
public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(long amount) {
        System.out.println(amount + " payed through credit card");
    }
}
