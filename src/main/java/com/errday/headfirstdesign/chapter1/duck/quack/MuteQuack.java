package com.errday.headfirstdesign.chapter1.duck.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println(" - ");
    }
}
