package com.errday.headfirstdesign.adapter;

public class WildDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }

    @Override
    public void fly() {
        System.out.println("먼 거리를 날고 있어요");
    }
}
