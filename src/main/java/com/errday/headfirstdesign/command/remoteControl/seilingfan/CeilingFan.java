package com.errday.headfirstdesign.command.remoteControl.seilingfan;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private final String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = 0;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " ceilingFan high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " ceilingFan medium");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " ceilingFan low");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + "ceilingFan off");
    }

    public int getSpeed() {
        return speed;
    }
}
