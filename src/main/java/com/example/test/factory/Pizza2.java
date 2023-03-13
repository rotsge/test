package com.example.test.factory;

public class Pizza2 extends Pizza{

    public void setName(String name) {
        super.setName(name);
    }

    @Override
    protected void bake() {
        System.out.println(name + "在烘焙");
    }

    @Override
    protected void cut() {
        System.out.println(name + "在切割");
    }

    @Override
    protected void box() {
        System.out.println(name + "在打包");
    }
}
