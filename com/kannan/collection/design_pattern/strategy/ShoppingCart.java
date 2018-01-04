package com.kannan.collection.design_pattern.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kannan Dharmalingam
 */
public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public long calculateTotal() {
        return this.items.stream().mapToInt(Item::getPrice).sum();
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(calculateTotal());
    }
}
