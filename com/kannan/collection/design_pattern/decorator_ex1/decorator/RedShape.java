package com.kannan.collection.design_pattern.decorator_ex1.decorator;

import com.kannan.collection.design_pattern.decorator_ex1.Shape;

/**
 * @author Kannan Dharmalingam
 */
public class RedShape extends AbstractDecorator {

    public RedShape(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        System.out.println("Red Shape Decorator");
        decoratedShape.draw();
        fillRedColor(decoratedShape);
    }

    private void fillRedColor(Shape decoratedShape) {
        System.out.println("Filling Red Color");
    }
}
