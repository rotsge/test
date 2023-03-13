package com.example.test.mubanfangfa;

public class Chundoujiang extends MubanFactory{
    @Override
    public void peiLiao() {
        System.out.println("不加配料");
    }

    @Override
    boolean jiaPeiLiao() {
        return false;
    }
}
