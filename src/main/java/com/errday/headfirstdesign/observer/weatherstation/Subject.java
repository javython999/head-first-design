package com.errday.headfirstdesign.observer.weatherstation;



public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
