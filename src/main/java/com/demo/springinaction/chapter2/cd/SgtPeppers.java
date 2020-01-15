package com.demo.springinaction.chapter2.cd;

import org.springframework.stereotype.Component;

@Component("sgtPeppers")
public class SgtPeppers implements ICompactDisc {

    public String title = "告白";
    public String artist = "周杰伦";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
