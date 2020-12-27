package com.springinaction.ch1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) {
        // Load Spring context
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("config/spring/knights.xml");

        // Get Knight bean
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();

        context.close();
    }
}
