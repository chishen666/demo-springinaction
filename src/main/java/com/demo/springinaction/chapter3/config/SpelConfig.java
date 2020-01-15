package com.demo.springinaction.chapter3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.demo.springinaction.chapter3.spel"})
public class SpelConfig {}
