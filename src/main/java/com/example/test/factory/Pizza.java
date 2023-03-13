package com.example.test.factory;

public abstract class Pizza {

   protected void setName(String name) {
        this.name = name;
    }

    protected String name;

    protected void prepare(){
        System.out.println(name + "正在准备");
    }

    protected abstract void bake();

    protected abstract void cut();

    protected abstract void box();

}
