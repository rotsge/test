package com.example.test.controller;

public class Father {
    public String name = "Father";
    public void func1(String s){
        func2(s);
    }
    public void func2(String s){
        System.out.println(s);
    }
}
