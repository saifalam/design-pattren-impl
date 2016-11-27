package com.saif.dp.observer.pattern.observers;

/**
 * Created by saif on 27.11.16.
 */
public interface Observer {

    public abstract void update( float temperature, float humidity, float pressure);
}
