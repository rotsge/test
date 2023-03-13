package com.example.test.service;

public class C{
    public void dependcy1(Interface1 interface1){
        interface1.ff1();
    }
    public void dep(A a){
        a.ff1();
    }
    public void dependcy2(Interface2 interface2){
        interface2.ff2();
    }
    public void dependcy3(Interface2 interface2){
        interface2.ff3();
    }
}
