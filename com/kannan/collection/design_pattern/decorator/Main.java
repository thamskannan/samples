package com.kannan.collection.design_pattern.decorator;

/**
 * @author Kannan Dharmalingam
 */
public class Main {
    public static void main(String[] args) {
        //drawing();
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(circle);
        Shape blueCircle = new BlueShapeDecorator(circle);

        System.out.println("Drawing Normal Circle");
        circle.draw();

        System.out.println("Drawing Red Circle");
        redCircle.draw();

        System.out.println("Drawing Blue Circle");
        blueCircle.draw();

    }

    /*
    Drawing Normal Circle
    Drawing Circle
    Drawing Red Circle
    Red Shape Decorator
    Drawing Circle
    Filling Red Color
    Drawing Blue Circle
    Blue Shape Decorator
    Drawing Circle
    Filling Blue Shape
     */
    private static void drawing() {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        Shape blueCircle = new BlueShapeDecorator(new Circle());
        Shape blueRectangle = new BlueShapeDecorator(new Rectangle());

        System.out.println("Drawing Normal Circle");
        circle.draw();

        System.out.println("Drawing Red Circle");
        redCircle.draw();

        System.out.println("Drawing Red Rectangle");
        redRectangle.draw();

        System.out.println("Drawing Blue Circle");
        blueCircle.draw();

        System.out.println("Drawing Blue Rectangle");
        blueRectangle.draw();
    }
}

/*
 Drawing Normal Circle
 Drawing Circle
 Drawing Red Circle
 Red Shape Decorator
 Drawing Circle
 Filling Red Color
 Drawing Red Rectangle
 Red Shape Decorator
 Draw Rectangle
 Filling Red Color
 Drawing Blue Circle
 Blue Shape Decorator
 Drawing Circle
 Filling Blue Shape
 Drawing Blue Rectangle
 Blue Shape Decorator
 Draw Rectangle
 Filling Blue Shape
 */