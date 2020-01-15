package com.demo.springinaction.chapter3.magic;

public class MagicBean {
    private String code;
    private String name;

    public MagicBean() {}

    public MagicBean(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MagicBean{" + "code='" + code + '\'' + ", name='" + name + '\'' + '}';
    }
}
