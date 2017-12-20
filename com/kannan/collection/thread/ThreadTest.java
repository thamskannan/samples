package com.kannan.collection.thread;

/**
 * @author Kannan Dharmalingam
 */
public class ThreadTest {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Old Java Way :" + Thread.currentThread().getName());
                System.out.println("Old Java Way :" + Thread.currentThread().getName());
            }
        };

        Runnable r2 = () -> {
            System.out.println("New Java Way :" + Thread.currentThread().getName());
            System.out.println("New Java Way :" + Thread.currentThread().getName());
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
