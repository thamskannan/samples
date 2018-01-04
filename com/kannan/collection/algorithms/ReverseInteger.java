package com.kannan.collection.algorithms;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger ob = new ReverseInteger();
        System.out.println(ob.reverse(12345));
    }

    private int reverse(int value) {
        int reverse = 0;
        while (value != 0) {
            reverse *= 10;
            reverse += value % 10;
            value /=10;
        }
        return reverse;
    }
}
