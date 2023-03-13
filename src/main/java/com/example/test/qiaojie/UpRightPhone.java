package com.example.test.qiaojie;

public class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直屏式手机");
    }

    @Override
    protected void sendMessage() {
        super.sendMessage();
        System.out.println("直屏式手机");
    }

    @Override
    protected void listenMusic() {
        super.listenMusic();
        System.out.println("直屏式手机");
    }
}
