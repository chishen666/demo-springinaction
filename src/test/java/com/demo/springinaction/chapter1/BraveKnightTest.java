package com.demo.springinaction.chapter1;

import org.junit.Test;
import org.mockito.Mockito;

public class BraveKnightTest {

    @Test
    public void testEmbarkOnQuest() {
        Quest questMock = Mockito.mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(questMock);
        braveKnight.embarkOnQuest();
        Mockito.verify(questMock, Mockito.times(1)).embark();
    }
}
