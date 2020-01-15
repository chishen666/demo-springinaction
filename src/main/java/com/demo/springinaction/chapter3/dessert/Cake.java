package com.demo.springinaction.chapter3.dessert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("aaa")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Cake implements IDessert {
    public void eat() {
        System.out.println("Eat cake!");
    }
}
