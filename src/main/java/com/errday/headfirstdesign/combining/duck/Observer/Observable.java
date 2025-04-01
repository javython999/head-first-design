package com.errday.headfirstdesign.combining.duck.Observer;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackableObserver {

    private final List<Observer> observers = new ArrayList<>();
    private final QuackableObserver duck;

    public Observable(QuackableObserver duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(duck);
        }
    }
}
