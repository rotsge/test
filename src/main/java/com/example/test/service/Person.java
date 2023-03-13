package com.example.test.service;

import org.springframework.stereotype.Service;

import java.io.*;


public class Person implements Cloneable, Serializable {

    private String name1;

    @Override
    public String toString() {
        return "Person{" +
                "name1='" + name1 + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    private int age;
    private String hobby;

    public Person(String name, int age, String hobby) {
        this.name1 = name;
        this.age = age;
        this.hobby = hobby;
    }

    public Person() {

    }

    public String getName() {
        return name1;
    }

    public void setName(String name) {
        this.name1 = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public Person clone() {
        Person person = null;
        try {
            person = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }

    public Person deepClone(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Person person = (Person) ois.readObject();
            return person;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
