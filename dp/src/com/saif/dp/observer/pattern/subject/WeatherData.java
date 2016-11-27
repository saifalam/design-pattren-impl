package com.saif.dp.observer.pattern.subject;

import com.saif.dp.observer.pattern.observers.Observer;

import java.util.ArrayList;

/**
 * Created by saif on 27.11.16.
 */
public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList<Observer> observars;

    public WeatherData() {
        observars = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer ob) {
        observars.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        int index = observars.indexOf(ob);
        if(index >= 0) {
            observars.remove(index);
        }

    }

    @Override
    public void notifyObserver() {
        for(int index = 0; index < observars.size(); index++) {
            Observer observer = observars.get(index);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementChanged(){
        notifyObserver();
    }
    public void setMeasurements(float temperature, float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();

    }
}
