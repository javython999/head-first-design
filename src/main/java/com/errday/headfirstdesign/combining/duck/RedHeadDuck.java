package com.errday.headfirstdesign.combining.duck;

import com.errday.headfirstdesign.combining.duck.Observer.Observable;
import com.errday.headfirstdesign.combining.duck.Observer.Observer;

public class RedHeadDuck implements Quackable {

    private final Observable observable;

    public RedHeadDuck() {
        observable = new Observable(this);
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
        return "RedHeadDuck";
    }
}
