package com.saif.dp.observer.pattern;

import com.saif.dp.observer.pattern.observers.CurrentConditionDisplay;
import com.saif.dp.observer.pattern.observers.ForecastDispaly;
import com.saif.dp.observer.pattern.observers.StatisticsDisplay;
import com.saif.dp.observer.pattern.subject.WeatherData;

/**
 * Created by saif on 27.11.16.
 */
public class WeatherStation {

    public static void main(String args[]) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDispaly forecastDispaly = new ForecastDispaly(weatherData);

        weatherData.setMeasurements(80,64,30.4f);
        weatherData.setMeasurements(82,70,29.7f);
        weatherData.setMeasurements(78,90,29.1f);
    }
}
