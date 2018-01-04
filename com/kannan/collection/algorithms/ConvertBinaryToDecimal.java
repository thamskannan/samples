package com.kannan.collection.algorithms;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        ConvertBinaryToDecimal ob = new ConvertBinaryToDecimal();
        ob.convertBinaryToDecimal(10011);  // 19
        ob.convertBinaryToDecimal(0);      // 0
        ob.convertBinaryToDecimal(1);      // 1
        ob.convertBinaryToDecimal(10);     // 2
        ob.convertBinaryToDecimal(11);     // 3
    }

    private void convertBinaryToDecimal(int number) {
        int value = 0;
        int power = 0;
        int reminder;
        while (number != 0) {
            reminder = number % 10;
            value += reminder * Math.pow(2, power);
            number /= 10;
            power++;
        }
        System.out.println(value);
    }
}
