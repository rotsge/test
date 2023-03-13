package com.example.test.qiaojie;

public class SlidePhone extends Phone{

    public SlidePhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("滑盖式手机");
    }

    @Override
    protected void sendMessage() {
        super.sendMessage();
        System.out.println("滑盖式手机");
    }

    @Override
    protected void listenMusic() {
        super.listenMusic();
        System.out.println("滑盖式手机");
    }
}
