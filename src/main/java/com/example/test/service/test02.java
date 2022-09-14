package com.example.test.service;

import org.springframework.stereotype.Service;

@Service
public class test02 {
    public void print(String name, int age, String hobby) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(hobby);
    }
}
