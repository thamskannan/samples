package com.kannan.collection.java8.interface_ex;

/**
 * @author Kannan Dharmalingam
 */
public class Ex_Default_Static_Interface implements InterfaceA, InterfaceB {

    static { //This will be called before object instantiation
        System.out.println("Static block");
    }

    private static void me() {
        System.out.println("Static method");
    }

    @Override
    public void display() {
        System.out.println("Display");
    }


    public static void main(String[] args) {
        Ex_Default_Static_Interface.me();
        Ex_Default_Static_Interface ex = new Ex_Default_Static_Interface();
        ex.display();
        ex.showA(10);
        ex.showB(20);
        InterfaceA.helloA("Thams");
        InterfaceB.helloB("Kannan");
    }
}

/* Output:
Static block
Static method
Display
Showing from Interface A :10
Showing from Interface B :20
Hello from Interface A :Thams
Hello from Interface B :Kannan
 */