package com.demo.springinaction.chapter3.dessert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cold")
public class Popsicle implements IDessert {
    public void eat() {
        System.out.println("Eat popsicle");
    }
}
