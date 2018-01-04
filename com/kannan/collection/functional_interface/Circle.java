package com.kannan.collection.functional_interface;

public class Circle implements Shape {
    @Override
    public void draw(String s) {
        System.out.println("Method Reference : " + s);
    }
}
