package com.errday.headfirstdesign.observer.weatherstation;

import com.errday.headfirstdesign.observer.weatherstation.impl.CurrentConditionDisplay;
import com.errday.headfirstdesign.observer.weatherstation.impl.HeatIndexDisplay;
import com.errday.headfirstdesign.observer.weatherstation.impl.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        //StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);
        //ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(80, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
