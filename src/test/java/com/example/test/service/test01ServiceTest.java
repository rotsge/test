package com.example.test.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class test01ServiceTest {
@Autowired
private test01Service test01Service;
    @Test
    public void test(){
        this.test01Service.test();
    }
}