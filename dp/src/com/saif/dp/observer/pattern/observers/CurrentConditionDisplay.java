package com.saif.dp.observer.pattern.observers;

import com.saif.dp.observer.pattern.subject.Subject;

/**
 * Created by saif on 27.11.16.
 */
public class CurrentConditionDisplay implements  Observer, DispalyElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        dispaly();
    }

    @Override
    public void dispaly() {
        System.out.println("Current Condition: " + temperature + "F degrees " + humidity+ "% humidity" );
    }
}
