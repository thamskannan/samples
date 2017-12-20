package com.kannan.collection.design_pattern.decorator_ex1.decorator;

import com.kannan.collection.design_pattern.decorator_ex1.Shape;

/**
 * @author Kannan Dharmalingam
 */
public class BlueShape extends AbstractDecorator {
    public BlueShape(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw() {
        System.out.println("Blue Shape Decorator");
        decoratedShape.draw();
        fillBlueShape(decoratedShape);
    }

    private void fillBlueShape(Shape decoratedShape) {
        System.out.println("Filling Blue Shape");
    }
}
