package com.errday.headfirstdesign.observer.weatherstation.impl;

import com.errday.headfirstdesign.observer.weatherstation.DisplayElement;
import com.errday.headfirstdesign.observer.weatherstation.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private final WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 온도: " + temperature + "F, 습도: " + humidity + "%");
    }
}
