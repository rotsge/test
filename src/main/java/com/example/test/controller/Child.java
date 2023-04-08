package com.example.test.controller;

public class Child extends Father{
    public String name = "Child";
    public void func1(){
        System.out.println(name);
    }
    public void func2(String s){
        System.out.println(s);
    }

}
