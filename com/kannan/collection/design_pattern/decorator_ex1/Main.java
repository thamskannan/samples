package com.kannan.collection.design_pattern.decorator_ex1;

import com.kannan.collection.design_pattern.decorator_ex1.decorator.BlueShape;
import com.kannan.collection.design_pattern.decorator_ex1.decorator.RedShape;

/**
 * @author Kannan Dharmalingam
 */
public class Main {
    public static void main(String[] args) {
        //drawing();
        Shape circle = new Circle();
        Shape redCircle = new RedShape(circle);
        Shape blueCircle = new BlueShape(circle);

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
        Shape redCircle = new RedShape(new Circle());
        Shape redRectangle = new RedShape(new Rectangle());
        Shape blueCircle = new BlueShape(new Circle());
        Shape blueRectangle = new BlueShape(new Rectangle());

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