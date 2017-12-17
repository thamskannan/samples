package com.kannan.collection.design_pattern.decorator;

/**
 * @author Kannan Dharmalingam
 */
public class BlueShapeDecorator extends AbstractDecorator {
    BlueShapeDecorator(Shape decoratedShape) {
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
