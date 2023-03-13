package com.example.test.service;

public class B implements Interface1,Interface3{
    @Override
    public void ff1() {
        System.out.println("B类实现了方法1");
    }

    @Override
    public void ff4() {
        System.out.println("B类实现了方法4");
    }

    @Override
    public void ff5() {
        System.out.println("B类实现了方法5");
    }
}
