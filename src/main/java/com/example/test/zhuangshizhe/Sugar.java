package com.example.test.zhuangshizhe;

public class Sugar extends Decorator{

    public Sugar(Drink drink) {
        super(drink);
        setDesc("加糖");
        setPrice(2.0f);
    }
}
