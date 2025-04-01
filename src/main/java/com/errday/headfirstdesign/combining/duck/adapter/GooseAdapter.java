package com.errday.headfirstdesign.combining.duck.adapter;

import com.errday.headfirstdesign.combining.duck.Observer.Observable;
import com.errday.headfirstdesign.combining.duck.Observer.Observer;
import com.errday.headfirstdesign.combining.duck.Quackable;

public class GooseAdapter implements Quackable {

    private final Observable observable;
    private final Goose goose;

    public GooseAdapter(Goose goose) {
        this.observable = new Observable(this);
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
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
        return "GooseAdapter";
    }
}
