package com.demo.springinaction.chapter1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.springinaction.chapter1.Knight;

public class KnightMain {
    public static void main(String[] args) {
        // 装配方式1：XML显示装配
        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("classpath:/chapter1/knight.xml");
        Knight knight = xmlApplicationContext.getBean(Knight.class);
        knight.embarkOnQuest();

        // 装配方式2：JavaBean装配
        ApplicationContext beanApplicationContext = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight1 = beanApplicationContext.getBean(Knight.class);
        knight1.embarkOnQuest();

    }
}
