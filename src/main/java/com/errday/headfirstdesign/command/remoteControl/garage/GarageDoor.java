package com.errday.headfirstdesign.command.remoteControl.garage;

import com.errday.headfirstdesign.command.remoteControl.light.Light;

public class GarageDoor {

    private final Light light;

    public GarageDoor(Light light) {
        this.light = light;
    }

    public void up() {
        System.out.println("차고 문을 올립니다.");
    }
    public void down() {
        System.out.println("차고 문을 내립니다.");
    }
    public void stop() {
        System.out.println("차고 문을 정지합니다.");
    }

    public void lightOn() {
        light.on();
    }
    public void lightOff() {
        light.off();
    }
}
