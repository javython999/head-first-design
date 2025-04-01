package com.errday.headfirstdesign.combining.duck;

import com.errday.headfirstdesign.combining.duck.Observer.Observable;
import com.errday.headfirstdesign.combining.duck.Observer.Observer;

public class MallardDuck implements Quackable {

    private final Observable observable;

    public MallardDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "MallardDuck";
    }
}
