package com.errday.headfirstdesign.chapter1.weatherstation;



public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
