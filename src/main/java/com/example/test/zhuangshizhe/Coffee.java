package com.example.test.zhuangshizhe;

public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
