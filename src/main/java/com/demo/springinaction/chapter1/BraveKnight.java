package com.demo.springinaction.chapter1;

/**
 * 勇敢的骑士
 * 
 * @Author: Carl.Xiang
 * @Date: 2019/12/29 18:04
 **/
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
