package com.kannan.collection.functional_interface;

import java.util.function.IntFunction;

public class Main {
    public static void main(String[] args) {
        Shape s = message -> {
            System.out.println("Function interface example");
            System.out.println("Drawing circle : " + message);
        };
        s.draw("Circle");
        Shape s1 = System.out::println;
        s1.draw("Hhhh");

        IntFunction<String> intToString = Integer::toString;
    }
}

/*
 Output:

 Function interface example
 Drawing circle : Circle
 */