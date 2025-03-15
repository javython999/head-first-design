package com.errday.headfirstdesign.observer.weatherstation;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
