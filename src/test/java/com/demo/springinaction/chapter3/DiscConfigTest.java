package com.demo.springinaction.chapter3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.springinaction.chapter3.config.DiscConfig;
import com.demo.springinaction.chapter3.disc.BlankDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DiscConfig.class)
public class DiscConfigTest {

    // @Autowired
    // @Qualifier("disc1")
    // private BlankDisc disc1;

    @Autowired
    @Qualifier("disc2")
    private BlankDisc disc2;

    @Test
    public void testBlankDisc() {
        // System.out.println(disc1);
        System.out.println(disc2);
    }
}
