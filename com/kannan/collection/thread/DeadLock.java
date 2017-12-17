package com.kannan.collection.thread;


public class DeadLock {
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public static void main(String args[]) {
        DeadLock ob = new DeadLock();
        ob.invokeDeadLock();
    }

    private void invokeDeadLock() {
        Thread1 T1 = new Thread1();
        Thread2 T2 = new Thread2();
        T1.start();
        T2.start();
    }

    private class Thread1 extends Thread {

        public void run() {
            synchronized (lock1) {
                System.out.println("Thread1 : holding lock 1");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Thread1: Interrupted");
                }
                System.out.println("Thread1: waiting for lock 2");
                synchronized (lock2) {
                    System.out.println("Thread1: holding lock 1,2");
                }
            }
        }
    }
    private class Thread2 extends Thread {

        public void run() {
            synchronized (lock2) {
                System.out.println("Thread2 : holding lock 2");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Thread2: Interrupted");
                }
                System.out.println("Thread2: waiting for lock 1");
                synchronized (lock1) {
                    System.out.println("Thread2: holding lock 1,2");
                }
            }
        }
    }
}