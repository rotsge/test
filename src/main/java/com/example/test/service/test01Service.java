package com.example.test.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class test01Service{
private String name;
private int age;
private String hobby1;

@Autowired
    private test02 test02;

public void test(){
test02.print(name,age,hobby1);
}



}
