package com.example.test.zhuangshizhe;

import sun.swing.BakedArrayList;

public class Test {
    public static void main(String[] args) {
        Drink blackCoffee = new BlackCoffee();
        blackCoffee = new Sugar(blackCoffee);
        System.out.println("费用："+blackCoffee.cost());
        System.out.println("明细："+blackCoffee.getDesc());
        blackCoffee = new Ice(blackCoffee);
        System.out.println("费用："+blackCoffee.cost());
        System.out.println("明细："+blackCoffee.getDesc());
    }
}
