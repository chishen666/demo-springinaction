package com.demo.springinaction.chapter3.dessert;

import org.springframework.stereotype.Component;

@Component
public class Cookies implements IDessert {
    public void eat() {
        System.out.println("Eat cookies!");
    }
}
