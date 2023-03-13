package com.example.test.zuhe;

public class Major extends OrganizationComponent{
    @Override
    protected void print() {
        System.out.println(getName()+getDesc());
    }

    public Major(String name, String desc) {
        super(name, desc);
    }

    public Major() {
    }
}
