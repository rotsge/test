package com.example.test.zhuangshizhe;

public class Decorator extends Drink{

    private final Drink drink;

    public Decorator(Drink drink){
        this.drink = drink;
    }

    @Override
    public float cost() {
        return getPrice()+ drink.cost();
    }

    @Override
    public String getDesc() {
        return drink.getDesc()+"_"+desc+getPrice();
    }
}
