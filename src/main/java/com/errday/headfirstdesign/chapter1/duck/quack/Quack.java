package com.errday.headfirstdesign.chapter1.duck.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
