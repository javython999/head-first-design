package com.errday.headfirstdesign.combining.duck.Observer;


public interface QuackableObserver {

    void registerObserver(Observer observer);
    void notifyObservers();
}
