package com.example.test.qiaojie;

public class Client {
    public static void main(String[] args) {
        Phone upRightPhone = new UpRightPhone(new Huawei());
        upRightPhone.call();
        upRightPhone.sendMessage();
        upRightPhone.listenMusic();

        System.out.println("______________________________");

        SlidePhone slidePhone = new SlidePhone(new Xiaomi());
        slidePhone.call();
        slidePhone.listenMusic();
        slidePhone.sendMessage();
    }
}
