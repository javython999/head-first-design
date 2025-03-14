package com.errday.headfirstdesign.chapter1.weatherstation;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
