package com.demo.springinaction.chapter2.cd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * CD播放器类
 * 
 * @Author: Carl.Xiang
 * @Date: 2019/12/30 9:34
 **/
@Component
public class CdPlayer {

    @Autowired(required = false)
    private ICompactDisc iCompactDisc;

    // @Autowired
    public CdPlayer(ICompactDisc iCompactDisc) {
        this.iCompactDisc = iCompactDisc;
    }

    public void play() {
        iCompactDisc.play();
    }

    public ICompactDisc getiCompactDisc() {
        return iCompactDisc;
    }

    // @Autowired
    public void setiCompactDisc(ICompactDisc iCompactDisc) {
        this.iCompactDisc = iCompactDisc;
    }
}
