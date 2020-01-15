package com.demo.springinaction.chapter2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.springinaction.chapter2.cd.CdPlayer;
import com.demo.springinaction.chapter2.config.CdPlayerConfig;
import com.demo.springinaction.chapter2.cd.ICompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerConfig.class)
public class CdPlayerTest {
    @Autowired
    private ICompactDisc compactDisc;

    @Autowired
    private CdPlayer cdPlayer;

    @Test
    public void cdShoudNotBeNull() {
        Assert.assertNotNull(compactDisc);
        cdPlayer.play();
    }

}
