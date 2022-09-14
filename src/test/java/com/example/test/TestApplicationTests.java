package com.example.test;

import com.example.test.service.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.util.Optional;

@SpringBootTest
class TestApplicationTests {


    @Test
    void contextLoads() {
        Person person = new Person();
        person.setAge(12);
        person.setHobby("sing");
        person.setName("zhangsan");
        Person person1 = null;
        System.out.println(person.getName() + "______________");
//        if (person1 != null){
//            System.out.println(person1.getAge() + "_________________");
//        }else {
//            System.out.println("person1 为空 !");
//        }
        Optional.ofNullable(person1).ifPresent(person2 -> {
            System.out.println(person2.getHobby());
        });
//        Person person2 = Optional.ofNullable(person1).orElseGet(new Person());

    }

}
