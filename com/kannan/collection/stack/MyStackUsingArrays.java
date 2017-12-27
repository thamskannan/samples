package com.kannan.collection.stack;

/**
 * Stacks operate in LIFO model.
 * A stack has a fixed location in the memory.
 * When a data element is pushed in the stack, the pointer points to the current element
 *
 * Stack plays vital role in many data structures, some of them are
 *    1. In parsing arithmetic expressions
 *    2. To help traverse nodes of binary tree
 *    3. Searching vertices of a graph
 *    4. In java, every method’s return type and arguments are
 *          pushed on to a stack and when method returns they are popped off.
 *
 *
 * @author Kannan Dharmalingam
 */
public class MyStackUsingArrays {
    private int arr[];
    private int top = -1;
    private int capacity;

    private MyStackUsingArrays(int size) {
        capacity = size;
        this.arr = new int[size];
    }

    private void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full.");
        } else {
            top++;
            arr[top] = data;
            System.out.println("Pushing " + data);
            display();
        }
    }

    private int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        int poppedValue = arr[top];
        //arr[top] = null; -- Assign null in-case of Object array or Collection, otherwise it become absolute reference and leads memory leak.
        top--;
        System.out.println("Popping " + poppedValue);
        display();
        return poppedValue;
    }

    private int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        int peekedValue = arr[top];
        System.out.println("Peeking " + peekedValue);
        return peekedValue;
    }

    private void display() {
        System.out.print("[");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == --capacity;
    }

    public static void main(String[] args) {
        MyStackUsingArrays stack = new MyStackUsingArrays(5);
        stack.push(5);
        stack.push(4);
        stack.push(6);
        stack.push(2);
        stack.push(7);
        stack.pop();
        stack.peek();
        stack.push(1);
    }
}

/* Output
 * 1. Pushing 5
     - [5 ]
   2. Pushing 4
     - [5 4 ]
   3. Pushing 6
     - [5 4 6 ]
   4. Pushing 2
     - [5 4 6 2 ]
   5. Pushing 7
     - [5 4 6 2 7 ]
   6. Popping 7
     - [5 4 6 2 ]
   7. Peeking 2
   8. Pushing 1
     - [5 4 6 2 1 ]
 */