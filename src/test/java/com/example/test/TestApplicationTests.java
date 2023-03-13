package com.example.test;

import com.example.test.service.Person;
import net.minidev.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.xmlunit.util.Mapper;

import javax.sound.midi.Soundbank;
import java.awt.*;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;

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
    @Test
    public void test() throws ParseException {
        System.out.println(Runtime.getRuntime().availableProcessors());
        Calendar instance = Calendar.getInstance();
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2022-04-23");
        instance.setTime(date);
//        instance.add(Calendar.YEAR,1);

        System.out.println(instance.getMaximum(Calendar.DATE));
        System.out.println(instance.getActualMaximum(Calendar.DATE));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(instance.getTime()));
    }

    @Test
    public void test1(){
        List<Integer> strings = new ArrayList<>();
        strings.add(223);
        strings.add(434);
        strings.add(123);
        
        Integer[] objects = strings.toArray(new Integer[3]);
        Arrays.sort(objects);
        System.out.println(Arrays.toString(objects));
        System.out.println(strings);
    }
    @Test
    public void test00(){
        System.out.println(calculate(10));
    }

    public int calculate(int n){
        if (n > 1) {
            return n+calculate(n-1);
        }else {
            return 1;
        }
    }

    @Test
    public void test01(){
        Map<String, String> map = new HashMap<>();
        map.put("21","22");
        map.put("33","44");
//        map.forEach((key,value)-> System.out.println(key+value));
//        for (Map.Entry<String, String> a : map.entrySet()){
//            System.out.println(a.getValue()+a.getKey());
//        }
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, String> next = iterator.next();
//            System.out.println(next.getValue()+next.getKey());
//        }
        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(map);
        concurrentHashMap.forEach((k,v)-> System.out.println(k+v));

    }
    @Test
    public void test03(){
        try {
            Robot robot = new Robot();
            while (true){
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(5000);
                    robot.mouseMove(200*i,200*i);
                }
            }
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
