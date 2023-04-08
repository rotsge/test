package com.example.test.controller;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test06 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("tom",3));
        users.add(new User("bob",6));
        users.add(new User("lily",8));
        users.add(new User("lisa",12));
        users.add(new User("jack",16));
        System.out.println(Runtime.getRuntime().availableProcessors());
//        Collections.sort(users, (o1, o2) -> o2.getAge()-o1.getAge());
//
//        users.forEach(user -> System.out.println(user.toString()));

//        users.sort((o1, o2) -> o2.getAge()-o1.getAge());
//        users.forEach(user -> System.out.println(user.toString()));

        List<User> collect = users.stream().filter(user -> user.getAge() > 6).collect(Collectors.toList());
        collect.forEach(user -> System.out.println(user.toString()));
    }
}
