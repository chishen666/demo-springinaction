package com.demo.springinaction.chapter3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.springinaction.chapter3.config.SpelConfig;
import com.demo.springinaction.chapter3.spel.Country;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpelConfig.class)
public class SpelConfigTest {

    @Autowired
    private Country country;

    @Test
    public void testSpel() {
        System.out.println(country);
    }
}
