package com.kannan.collection.queue;

/**
 * @author Kannan Dharmalingam
 */
public class MyQueueUsingArrays {
    private int queueArr[];
    private int front = 0;
    private int rear = -1;
    private int capacity;
    private int currentSize = 0;

    private MyQueueUsingArrays(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    /**
     * Adds element at the end of the queue.
     *
     * @param item item tobe added in to the queue
     */
    private void enqueue(int item) {
        if (isQueueFull()) {
            System.out.print("Overflow ! Unable to add element: " + item);
        } else {
            rear++;
            if (rear == capacity) {
                rear = 0;
            }
            queueArr[rear] = item;
            currentSize++;
            System.out.print("Add " + item);
        }
    }

    /**
     * Removes an element from the top of the queue
     */
    private void dequeue() {
        if (isQueueEmpty()) {
            System.out.print("Underflow ! Unable to remove element from Queue");
        } else {
            front++;
            System.out.print("Remove " + queueArr[front - 1]);
            if (front == capacity) {
                front = 0;
            }
            currentSize--;
        }
    }

    /**
     * Checks whether the queue is full or not
     *
     * @return boolean
     */
    private boolean isQueueFull() {
        return currentSize == capacity;
    }

    /**
     * Checks whether the queue is empty or not
     *
     * @return boolean
     */
    private boolean isQueueEmpty() {
        return currentSize == 0;
    }

    private void display() {
        System.out.print("[");
        for (int aQueueArr : queueArr) {
            System.out.print(aQueueArr + " ");
        }
        System.out.println("]" + "Front: " + front + ", Rear: " + rear + ", CurrentSize: " + currentSize);
    }

    public static void main(String a[]) {

        MyQueueUsingArrays queue = new MyQueueUsingArrays(4);
        System.out.print("Initial");queue.display();
        queue.enqueue(1);queue.display();
        queue.dequeue();queue.display();
        queue.enqueue(2);queue.display();
        queue.enqueue(3);queue.display();
        queue.enqueue(4);queue.display();
        queue.dequeue();queue.display();
        queue.dequeue();queue.display();
        queue.enqueue(5);queue.display();
        queue.dequeue();queue.display();
        queue.enqueue(6);queue.display();
        queue.enqueue(7);queue.display();
        queue.enqueue(8);queue.display();
        queue.enqueue(9);queue.display();
    }
}

/* Output
Initial[0 0 0 0 ]Front: 0, Rear: -1, CurrentSize: 0
Add 1[1 0 0 0 ]Front: 0, Rear: 0, CurrentSize: 1
Remove 1[1 0 0 0 ]Front: 1, Rear: 0, CurrentSize: 0
Add 2[1 2 0 0 ]Front: 1, Rear: 1, CurrentSize: 1
Add 3[1 2 3 0 ]Front: 1, Rear: 2, CurrentSize: 2
Add 4[1 2 3 4 ]Front: 1, Rear: 3, CurrentSize: 3
Remove 2[1 2 3 4 ]Front: 2, Rear: 3, CurrentSize: 2
Remove 3[1 2 3 4 ]Front: 3, Rear: 3, CurrentSize: 1
Add 5[5 2 3 4 ]Front: 3, Rear: 0, CurrentSize: 2
Remove 4[5 2 3 4 ]Front: 0, Rear: 0, CurrentSize: 1
Add 6[5 6 3 4 ]Front: 0, Rear: 1, CurrentSize: 2
Add 7[5 6 7 4 ]Front: 0, Rear: 2, CurrentSize: 3
Add 8[5 6 7 8 ]Front: 0, Rear: 3, CurrentSize: 4
Overflow ! Unable to add element: 9[5 6 7 8 ]Front: 0, Rear: 3, CurrentSize: 4
*/