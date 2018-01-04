package com.kannan.collection.list;

import java.util.Arrays;

public class MyList {
    private Object[] array;
    private int capacity = 10;
    private int size;

    public MyList() {
        this.array = new Object[this.capacity];
    }

    public Object get(int index) {
        checkRange(index);
        return array[index];
    }

    public void add(Object value) {
        ensureCapacity();
        array[size++] = value;
    }

    public Object remove(int index) {
        checkRange(index);
        Object oldObject = array[index];
        int indexToShift = size - index - 1;
        if (indexToShift > 0) {
            System.arraycopy(array, index+1, array, index, indexToShift);
        }
        array[--size] = null; // Remove absolute reference
        return oldObject;
    }

    private void checkRange(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void ensureCapacity() {
        if (capacity == size) {
            capacity *= 2; // Double the size
            array = Arrays.copyOf(array, capacity);
        }
    }

    private void display() {
        ensureCapacity();
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(1);
        list.add(40);
        list.display();
        System.out.println(list.get(2));
    }
}
