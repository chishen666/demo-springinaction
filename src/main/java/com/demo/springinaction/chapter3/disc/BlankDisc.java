package com.demo.springinaction.chapter3.disc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("disc2")
public class BlankDisc {

    @Value("${disc.title2}")
    private String title;

    // @Value("${disc.artist2}")
    private String artist;

    public BlankDisc() {}

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "BlankDisc{" + "title='" + title + '\'' + ", artist='" + artist + '\'' + '}';
    }
}
