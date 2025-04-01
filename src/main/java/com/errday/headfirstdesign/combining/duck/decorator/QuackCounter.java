package com.errday.headfirstdesign.combining.duck.decorator;

import com.errday.headfirstdesign.combining.duck.Observer.Observer;
import com.errday.headfirstdesign.combining.duck.Quackable;

public class QuackCounter implements Quackable {

    private static int countOfQuacked = 0;

    private final Quackable duck;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        countOfQuacked++;
    }

    public static int getCountOfQuacked() {
        return countOfQuacked;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
