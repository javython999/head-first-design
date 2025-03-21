package com.errday.headfirstdesign.command.remoteControl.seilingfan;

public class CeilingFan {

    private final String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void high() {
        System.out.println(name + " ceilingFan high");
    }

    public void off() {
        System.out.println(name + "ceilingFan off");
    }
}
