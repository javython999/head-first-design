package com.errday.headfirstdesign.command.remoteControl.hottub;

public class Hottub {

    private float temperature;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        System.out.println("hottub set temperature: " + temperature + "℃");
    }

    public float getTemperature() {
        return temperature;
    }
}
