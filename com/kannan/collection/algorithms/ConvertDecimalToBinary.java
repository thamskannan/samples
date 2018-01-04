package com.kannan.collection.algorithms;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        ConvertDecimalToBinary ob = new ConvertDecimalToBinary();
        ob.convertDecimalToBinary(19);
    }

    private void convertDecimalToBinary(int number) {
        byte[] value = new byte[25];
        int index = 0;
        while (number > 0) {
            value[index++] = (byte) (number % 2);
            number = number / 2;
        }

        for(int i = index - 1; i >= 0; i--) {
            System.out.print(value[i] + " ");
        }
    }
}
