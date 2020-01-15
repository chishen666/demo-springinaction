package com.demo.springinaction.chapter3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Calendar;

@Configuration
@ComponentScan(basePackages = "com.demo.springinaction.chapter3")
public class CalendarConfig {

    @Bean
    @Profile({"dev"})
    public Calendar birth1() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1993, 9, 8);
        return calendar;
    }

    @Bean
    @Profile({"test"})
    public Calendar birth2() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, 9, 8);
        return calendar;
    }
}
