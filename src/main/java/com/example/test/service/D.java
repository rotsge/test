package com.example.test.service;

public class D {

    public void dependcy1(Interface1 interface1){
        interface1.ff1();
    }
    public void dependcy2(Interface3 interface3){
        interface3.ff4();
    }
    public void dependcy3(Interface3 interface3){
        interface3.ff5();
    }
}
