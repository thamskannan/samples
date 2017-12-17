package com.kannan.collection.design_pattern.decorator;

/**
 * @author Kannan Dharmalingam
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
