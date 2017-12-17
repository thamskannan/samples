package com.kannan.collection.design_pattern.decorator;

/**
 * @author Kannan Dharmalingam
 */
public class RedShapeDecorator extends AbstractDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
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
