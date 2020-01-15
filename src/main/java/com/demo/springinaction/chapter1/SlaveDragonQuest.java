package com.demo.springinaction.chapter1;

import java.io.PrintStream;

/**
 * 诛杀恶龙的请求
 * 
 * @Author: Carl.Xiang
 * @Date: 2019/12/29 17:22
 **/
public class SlaveDragonQuest implements Quest {

    private PrintStream stream;

    public SlaveDragonQuest() {}

    public SlaveDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("NB的骑士，去诛杀恶龙吧！");
    }
}
