package com.example.test.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class test01ServiceTest {
@Autowired
private test01Service test01Service;

    @Test
    public void test(){
        this.test01Service.test();
    }

    @Test
    public void test01(){
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
//        instance.add(Calendar.DATE,3);
//        instance.add(Calendar.MONTH,1);
        Date time = instance.getTime();
        System.out.println(new SimpleDateFormat("yyyy_MM_dd").format(time));
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        System.out.println(instance.get(Calendar.WEEK_OF_MONTH));
        System.out.println(instance.get(Calendar.DAY_OF_WEEK));
        System.out.println(instance.get(Calendar.MONTH));
        System.out.println(instance.get(Calendar.DATE));
        System.out.println(instance.getActualMaximum(Calendar.DATE));
    }

    @Test
    public void test02(){
        C a = new C();
        a.dependcy1(new B());
        a.dependcy2(new A());
        a.dependcy3(new A());
        System.out.println("_______________");

        F f = new F();
        f.ff2();
        te(new A());

    }

    public void te(Interface2 interface2){
        interface2.ff2();
    }

    @Test
    public void test03(){
        Person person = new Person("adong", 10, "helloworld");
        Person person1 = person.deepClone();
        System.out.println(person1.toString());
        System.out.println(person);
    }

    @Test
    public void test00(){
        B a = new B();
        Interface1 a1 = a;
        a1.ff1();
    }

    @Test
    public void test001(){
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        Thread thread1 = new Thread(myThread);
        thread.setName("xc1");
        thread1.setName("xc2");
//        thread.start();
        thread1.start();
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        Thread thread1 = new Thread(myThread);
        thread.setName("xc1");
        thread1.setName("xc2");
        thread.start();
        thread1.start();
    }

    public static class MyThread implements  Runnable{
        private int a= 100;
        @Override
        public void run() {
            while (true) {
                if (a > 0) {
                    synchronized (this) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(a + "_" + Thread.currentThread().getName());
                        a--;
                    }
                    }else{
                        return;
                    }
                }
        }
    }
}