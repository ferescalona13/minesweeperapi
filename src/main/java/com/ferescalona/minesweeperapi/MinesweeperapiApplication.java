package com.ferescalona.minesweeperapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MinesweeperapiApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MinesweeperapiApplication.class, args);

//        Arrays.asList(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

//        System.out.println(applicationContext);
    }
}
