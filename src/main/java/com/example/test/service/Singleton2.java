package com.example.test.service;

public enum Singleton2 {
    INSTANCE(12);

    Singleton2(int i) {
    }

    public void test(){
        System.out.println("test");
    }
}

class test{
    public static void main(String[] args) {
        Test11 test = new Test11();
        Test11 test1 = new Test11();
        Test11 test2 = new Test11();

    }
}
class Test11 {
    String name;

    {
        System.out.println("我是构造代码块");
    }

    static {
        System.out.println("我是静态代码快");
    }

    public Test11() {
        System.out.println("我是Test类的构造方法");
    }
}