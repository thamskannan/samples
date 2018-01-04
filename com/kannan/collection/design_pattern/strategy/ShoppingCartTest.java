package com.kannan.collection.design_pattern.strategy;

/**
 * @author Kannan Dharmalingam
 */
public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("100001", 10));
        cart.addItem(new Item("100002", 20));
        cart.addItem(new Item("100003", 30));

        //Pay by Credit card
        cart.pay(new CreditCardStrategy("kannan", "411111111", "123", "12/22"));

        //Pay by Paypal
        cart.pay(new PaypalStrategy("kannan@test.com", "testpassword"));
    }
}

/* Output:
60 payed through credit card
60 payed through paypal
*/