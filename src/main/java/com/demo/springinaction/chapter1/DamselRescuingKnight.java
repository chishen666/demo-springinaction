package com.demo.springinaction.chapter1;

/**
 * 拯救公主的骑士
 * 
 * @Author: Carl.Xiang
 * @Date: 2019/12/29 16:13
 **/
public class DamselRescuingKnight implements Knight {
    private DamselRescuingQuest damselRescuingQuest;

    public DamselRescuingKnight() {
        this.damselRescuingQuest = new DamselRescuingQuest();

    }

    public void embarkOnQuest() {
        damselRescuingQuest.embark();
    }
}
