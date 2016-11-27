package com.saif.dp.observer.pattern.observers;

import com.saif.dp.observer.pattern.subject.Subject;

/**
 * Created by saif on 27.11.16.
 */
public class ForecastDispaly implements Observer, DispalyElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDispaly(Subject subject) {
        this.weatherData = subject;
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
        System.out.println("Weather forecast: " + temperature + "F degrees " + humidity+ "% humidity" );
    }
}
