package com.errday.headfirstdesign.chapter1.duck.quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak");
    }
}
