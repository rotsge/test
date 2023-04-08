package com.example.test.controller;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class test {
    private static Lock lock = new ReentrantLock();
    private static Condition conditionA = lock.newCondition();
    private static Condition conditionB = lock.newCondition();
    private static Condition conditionC = lock.newCondition();
    private static int count = 0;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (count <= 100) {
                    lock.lock();
                    try {
                        System.out.println(Thread.currentThread().getName() + " " + count++);
                        conditionB.signal();
                        conditionA.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }, "ThreadA").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (count <= 100) {
                    lock.lock();
                    try {
                        System.out.println(Thread.currentThread().getName() + " " + count++);
                        conditionC.signal();
                        conditionB.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }, "ThreadB").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (count <= 100) {
                    lock.lock();
                    try {
                        System.out.println(Thread.currentThread().getName() + " " + count++);
                        conditionA.signal();
                        conditionC.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }, "ThreadC").start();
    }
}
