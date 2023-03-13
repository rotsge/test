package com.example.test.qiaojie;

public abstract class Phone {

    protected Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void call(){
        this.brand.call();
    }

    protected void sendMessage(){
        this.brand.sendMessage();
    }

    protected void listenMusic(){
        this.brand.listenMusic();
    }

}
