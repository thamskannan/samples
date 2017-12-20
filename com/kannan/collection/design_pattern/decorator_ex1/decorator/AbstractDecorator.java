package com.kannan.collection.design_pattern.decorator_ex1.decorator;

import com.kannan.collection.design_pattern.decorator_ex1.Shape;

/**
 * @author Kannan Dharmalingam
 */
public abstract class AbstractDecorator implements Shape {
    Shape decoratedShape;

    public AbstractDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        System.out.println("Abstract Decorator");
        decoratedShape.draw();
    }
}
