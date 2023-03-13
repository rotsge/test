package com.example.test.service;

public class TestSuo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("进入主线程");
        test test = new test();
        new Thread(()->{
            try {
                test.t2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        Thread.sleep(100);
        try {
            test.t1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class test{
        Object o = new Object();
        public synchronized void t1() throws InterruptedException {
            System.out.println("方法1");
            t2();
            System.out.println("111");
        }
        public void t2() throws InterruptedException {
            synchronized (o){

                System.out.println("方法2");
                Thread.sleep(10000);
            }
        }

    }
}
