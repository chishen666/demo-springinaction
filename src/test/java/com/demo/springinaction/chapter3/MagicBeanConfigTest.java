package com.demo.springinaction.chapter3;

import com.demo.springinaction.chapter3.magic.MagicBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.springinaction.chapter3.config.MagicBeanConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagicBeanConfig.class)
public class MagicBeanConfigTest {

    @Autowired(required = false)
    private MagicBean magicBean;

    @Test
    public void testMagicBean() {
        System.out.println(magicBean);
    }

}
