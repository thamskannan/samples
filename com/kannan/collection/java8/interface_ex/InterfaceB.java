package com.kannan.collection.java8.interface_ex;

/**
 * @author Kannan Dharmalingam
 */
public interface InterfaceB {
    void display();
    
    default void showB(Integer a) {
        System.out.println("Showing from Interface B :" + a);
    }

    static void helloB(String name) {
        System.out.println("Hello from Interface B :" + name);
    }
}
