package com.example.test.factory;

import org.yaml.snakeyaml.reader.StreamReader;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public static void main(String[] args) {
        new OrderPizza();
    }

    public OrderPizza(){
        while (true){
            String type = getType();
            Pizza pizza = PizzaFactory.returnPizza(type);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("没有你想要的pizza");
                break;
            }
        }
    }

    private String getType() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入pizza种类：");
        try {
            String s = bufferedReader.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
