package com.errday.headfirstdesign.facade;

public class TheaterLights {

    public void dim(int dimLevel) {
        System.out.println("light dimming " + dimLevel + "%");
    }

    public void on() {
        System.out.println("light on");
    }
}
