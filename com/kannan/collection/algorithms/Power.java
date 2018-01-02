package com.kannan.collection.algorithms;

/**
 * @author Kannan Dharmalingam
 */
public class Power {
    public static void main(String[] args) {
        Power ob = new Power();
        System.out.println(ob.pow(2,4));
    }

    private int pow(int x, int y) {
        int temp;
        if (y == 0) {
            return 1;
        }
        temp = pow(x, y/2);
        if (y%2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }
}
