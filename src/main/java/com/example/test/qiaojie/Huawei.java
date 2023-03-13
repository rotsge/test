package com.example.test.qiaojie;

public class Huawei implements Brand{
    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("华为手机发信息");
    }

    @Override
    public void listenMusic() {
        System.out.println("华为手机听音乐");
    }
}
