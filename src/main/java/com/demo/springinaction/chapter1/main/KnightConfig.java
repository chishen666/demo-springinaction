package com.demo.springinaction.chapter1.main;

import com.demo.springinaction.chapter1.BraveKnight;
import com.demo.springinaction.chapter1.Knight;
import com.demo.springinaction.chapter1.Quest;
import com.demo.springinaction.chapter1.SlaveDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlaveDragonQuest(System.out);
    }

}
