package com.errday.headfirstdesign.combining.duck.composite;

import com.errday.headfirstdesign.combining.duck.Observer.Observer;
import com.errday.headfirstdesign.combining.duck.Quackable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {

    List<Quackable> ducks = new ArrayList<>();

    public void add(Quackable duck) {
        ducks.add(duck);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = iterator.next();
            duck.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {}

    @Override
    public String toString() {
        return "Flock";
    }
}
