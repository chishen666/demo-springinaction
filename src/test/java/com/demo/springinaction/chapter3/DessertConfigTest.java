package com.demo.springinaction.chapter3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.springinaction.chapter3.config.DessertConfig;
import com.demo.springinaction.chapter3.dessert.IDessert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class DessertConfigTest {

    @Autowired(required = false)
    @Qualifier("cake")
    private IDessert iDessert;

    @Test
    public void testDessertConfig() {
        iDessert.eat();
        System.out.println(iDessert);
    }

}
