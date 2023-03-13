package com.example.test.qiaojie;

public class Xiaomi implements Brand{
    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("小米手机发信息");
    }

    @Override
    public void listenMusic() {
        System.out.println("小米手机听音乐");
    }
}
