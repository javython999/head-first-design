package com.errday.headfirstdesign.combining.duck;

import com.errday.headfirstdesign.combining.duck.Observer.Observable;
import com.errday.headfirstdesign.combining.duck.Observer.Observer;

public class DuckCall implements Quackable {

    private final Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("꽉꽉");
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
        return "DuckCall";
    }
}
