package com.example.test.factory;

public class PizzaFactory {

    public static Pizza returnPizza(String type){
        Pizza pizza = null;
        if (type.equals("pizza1")){
            pizza = new Pizza1();
            pizza.setName("pizza1");
        } else if(type.equals("pizza2")){
            pizza = new Pizza2();
            pizza.setName("pizza2");
        }
        return pizza;
    }
}
