package com.demo.springinaction.chapter2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.springinaction.chapter2.cd.CdPlayer;
import com.demo.springinaction.chapter2.cd.ICompactDisc;
import com.demo.springinaction.chapter2.cd.SgtPeppers;

@Configuration
// @ComponentScan("com.demo.springinaction.chapter2")
// @ComponentScan(basePackages = {"com.demo.springinaction.chapter1", "com.demo.springinaction.chapter2"})
// @ComponentScan(basePackageClasses = {CdPlayerConfig.class})
public class CdPlayerConfig {

    @Bean
    public CdPlayer cdPlayer(ICompactDisc sgtPeppers) {
        return new CdPlayer(sgtPeppers);
    }

    @Bean(name = "sgtPeppers")
    public ICompactDisc sgtPeppers() {
        return new SgtPeppers();
    }
}
