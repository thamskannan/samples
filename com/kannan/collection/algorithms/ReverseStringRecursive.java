package com.kannan.collection.algorithms;

public class ReverseStringRecursive {
    private String result = "";

    public static void main(String[] args) {
        ReverseStringRecursive ob = new ReverseStringRecursive();
        System.out.println(ob.reverse("Kannan"));

    }

    private String reverse(String value) {

        if (value != null && value.length() == 1) {
            return value;
        } else {
            result += value.charAt(value.length() - 1) + reverse(value.substring(0, value.length() - 1));
        }
        return result;
    }
}
