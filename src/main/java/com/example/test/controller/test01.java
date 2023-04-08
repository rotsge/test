package com.example.test.controller;



public class test01 {
    public static void main(String[] args){
        Father child = new Child();
        Father father = new Father();
        child.func1(child.name);
        System.out.println(child.name);
//        System.out.println(child.(Father.name));
    }
}
