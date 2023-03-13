package com.example.test.service;

import sun.security.jca.GetInstance;

import java.io.PipedReader;
import java.util.PrimitiveIterator;

public class Singleton {
    private static volatile Singleton singleton;

    private Singleton(){};

    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null)
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
class Singleton1{
    private Singleton1(){};

    private static class SingletonInstace{
        private static final Singleton1 SINGLETON = new Singleton1();
    }

    public static Singleton1 getInstance(){
        return SingletonInstace.SINGLETON;
    }
}

class Singleton3{
    private Singleton3(){};
    private static final Singleton3 SINGLETON_3 = new Singleton3();
    public static Singleton3 getInstance(){
        return SINGLETON_3;
    }
}

class  Singleton4{
    private Singleton4(){};

    private static Singleton4 singleton4;

    static {
        singleton4 = new Singleton4();
    }

    public static Singleton4 getInstance(){
        return singleton4;
    }
}