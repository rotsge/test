package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.awt.*;
import java.awt.event.InputEvent;

@SpringBootApplication
public class TestApplication {

//    public static void main(String[] args) {
////        SpringApplication.run(TestApplication.class, args);
//        SpringApplicationBuilder builder = new SpringApplicationBuilder(TestApplication.class);
//        //SpringApplication.run(SystemctlApplication.class, args);
//        builder.headless(false)
//                // .web(WebApplicationType.NONE)
//                // .bannerMode(Banner.Mode.OFF)
//                .run(args);
//    }

    public static void main(String[] args){
        try {
            Robot robot = new Robot();
            while (true){
                for (int i = 1; i < 8; i++) {
                    Thread.sleep(5000);
                    robot.mouseMove(1200,600);
//                    robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
                        robot.mouseWheel(20);
                        robot.mouseWheel(-20);
                    if (i==3)
                        continue;
                    System.out.println(i+"------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
