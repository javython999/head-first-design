package com.errday.headfirstdesign.observer.weatherstation.impl;

import com.errday.headfirstdesign.observer.weatherstation.DisplayElement;
import com.errday.headfirstdesign.observer.weatherstation.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure;
    private float lastPressure;
    private final WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("기상 예보: " + forecast(currentPressure, lastPressure));
    }

    private String forecast(float currentPressure, float lastPressure) {
        if (currentPressure > lastPressure) {
            return "날씨가 좋아지고 있습니다.";
        } else if (currentPressure == lastPressure) {
            return "지금과 비슷할 것 같습니다.";
        } else {
            return "쌀쌀하며 비가 올 것 같습니다.";
        }
    }
}
