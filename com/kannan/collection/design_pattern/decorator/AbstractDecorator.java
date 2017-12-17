package com.kannan.collection.design_pattern.decorator;

/**
 * @author Kannan Dharmalingam
 */
public abstract class AbstractDecorator implements Shape {

    Shape decoratedShape;

    AbstractDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        System.out.println("Abstract Decorator");
        decoratedShape.draw();
    }
}
