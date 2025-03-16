package com.errday.headfirstdesign.observer.weatherstation.impl;

import com.errday.headfirstdesign.observer.weatherstation.DisplayElement;
import com.errday.headfirstdesign.observer.weatherstation.Observer;

import java.util.ArrayList;
import java.util.List;

public class StaticsDisplay implements Observer, DisplayElement {

    private final List<Float> temperatures;
    private final WeatherData weatherData;

    public StaticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.temperatures = new ArrayList<>();
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        temperatures.add(weatherData.getTemperature());
        display();
    }

    @Override
    public void display() {
        System.out.println(displayContent());
    }

    private String displayContent() {
        return new StringBuilder().append("평균/최고/최저 온도: ")
                .append(String.format("%.1f", averageTemperature()))
                .append("/")
                .append(String.format("%.1f", maxTemperature()))
                .append("/")
                .append(String.format("%.1f", minTemperature()))
                .toString();
    }

    private float averageTemperature() {
        return (float) temperatures.stream()
                .mapToDouble(Float::doubleValue)
                .average()
                .orElse(0.0);
    }

    private float maxTemperature() {
        return (float) temperatures.stream()
                .mapToDouble(Float::doubleValue)
                .max()
                .orElse(0.0);
    }

    private float minTemperature() {
        return (float) temperatures.stream()
                .mapToDouble(Float::doubleValue)
                .min()
                .orElse(0.0);
    }
}
