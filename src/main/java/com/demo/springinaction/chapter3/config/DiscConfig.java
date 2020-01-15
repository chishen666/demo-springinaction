package com.demo.springinaction.chapter3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.DefaultResourceLoader;

/**
 * ddd
 * 
 * @Author: Carl.Xiang
 * @Date: 2019/12/31 10:33
 **/
@Configuration
// @PropertySource("classpath:chapter3/disc.properties")
@ComponentScan(basePackages = {"com.demo.springinaction.chapter3.disc"})
public class DiscConfig {
    // @Autowired
    // private Environment environment;
    //
    // @Bean
    // @Qualifier("disc1")
    // public BlankDisc blankDisc() {
    // String title = environment.getProperty("disc.title1");
    // String artist = environment.getProperty("disc.artist1");
    // return new BlankDisc(title, artist);
    // }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
            new PropertySourcesPlaceholderConfigurer();
        propertySourcesPlaceholderConfigurer
            .setLocation(new DefaultResourceLoader().getResource("classpath:chapter3/disc.properties"));
        return propertySourcesPlaceholderConfigurer;
    }
}
