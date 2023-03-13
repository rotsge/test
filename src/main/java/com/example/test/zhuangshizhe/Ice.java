package com.example.test.zhuangshizhe;

public class Ice extends Decorator{

    public Ice(Drink drink) {
        super(drink);
        setPrice(1.0f);
        setDesc("加冰");
    }
}
