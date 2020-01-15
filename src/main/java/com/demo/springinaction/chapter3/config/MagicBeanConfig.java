package com.demo.springinaction.chapter3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import com.demo.springinaction.chapter3.magic.MagicBean;
import com.demo.springinaction.chapter3.magic.MagicBeanConfigCondition;

@Component
@ComponentScan(basePackages = "com.demo.springinaction.chapter3")
public class MagicBeanConfig {

    @Bean
    @Conditional(MagicBeanConfigCondition.class)
    public MagicBean magicBean() {
        return new MagicBean("apple", "苹果");
    }
}
