package com.kannan.collection.queue;

/**
 * @author Kannan Dharmalingam
 */
public class MyQueueUsingArrays {
    private int capacity;
    private int queueArr[];
    private int front = 0;
    private int rear = -1;
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
            if (rear == capacity - 1) {
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
            if (front == capacity - 1) {
                System.out.print("Remove " + queueArr[front - 1]);
                front = 0;
            } else {
                System.out.print("Remove " + queueArr[front - 1]);
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
        for (int i = 0; i <= queueArr.length - 1; i++) {
            System.out.print(queueArr[i] + " ");
        }
        System.out.println("]" + "Front: " + front + ", Rear: " + rear + ", CurrentSize: " + currentSize);
    }

    public static void main(String a[]) {

        MyQueueUsingArrays queue = new MyQueueUsingArrays(4);
        System.out.print("Initial");queue.display();
        queue.enqueue(4);queue.display();
        queue.dequeue();queue.display();
        queue.enqueue(56);queue.display();
        queue.enqueue(2);queue.display();
        queue.enqueue(67);queue.display();
        queue.dequeue();queue.display();
        queue.dequeue();queue.display();
        queue.enqueue(24);queue.display();
        queue.dequeue();queue.display();
        queue.enqueue(98);queue.display();
        queue.enqueue(45);queue.display();
        queue.enqueue(23);queue.display();
        queue.enqueue(435);queue.display();
    }
}

/* Output
Initial   [0 0 0 0 ]    Front: 0, Rear: -1, CurrentSize: 0
Add 4     [4 0 0 0 ]    Front: 0, Rear: 0,  CurrentSize: 1
Remove 4  [4 0 0 0 ]    Front: 1, Rear: 0,  CurrentSize: 0
Add 56    [4 56 0 0 ]   Front: 1, Rear: 1,  CurrentSize: 1
Add 2     [4 56 2 0 ]   Front: 1, Rear: 2,  CurrentSize: 2
Add 67    [67 56 2 0 ]  Front: 1, Rear: 0,  CurrentSize: 3
Remove 56 [67 56 2 0 ]  Front: 2, Rear: 0,  CurrentSize: 2
Remove 2  [67 56 2 0 ]  Front: 0, Rear: 0,  CurrentSize: 1
Add 24    [67 24 2 0 ]  Front: 0, Rear: 1,  CurrentSize: 2
Remove 67 [67 24 2 0 ]  Front: 1, Rear: 1,  CurrentSize: 1
Add 98    [67 24 98 0 ] Front: 1, Rear: 2,  CurrentSize: 2
Add 45    [45 24 98 0 ] Front: 1, Rear: 0,  CurrentSize: 3
Add 23    [45 23 98 0 ] Front: 1, Rear: 1,  CurrentSize: 4
Overflow ! Unable to add element: 435 [45 23 98 0 ]Front: 1, Rear: 1, CurrentSize: 4
*/