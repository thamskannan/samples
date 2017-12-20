package com.kannan.collection.java8.interface_ex;

/**
 * @author Kannan Dharmalingam
 */
public interface InterfaceA {
    void display();

    default void showA(Integer a) {
        System.out.println("Showing from Interface A :" + a);
    }

    static void helloA(String name) {
        System.out.println("Hello from Interface A :" + name);
    }
}
