package com.errday.headfirstdesign.combining.duck.Observer;

public class Quackologist implements Observer {
    @Override
    public void update(QuackableObserver duck) {
        System.out.println("꽥꽥학자: " + duck + "가 방금 소리 냈다.");
    }
}
