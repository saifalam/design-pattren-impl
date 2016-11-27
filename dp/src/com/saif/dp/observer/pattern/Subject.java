package com.saif.dp.observer.pattern;

/**
 * Created by saif on 27.11.16.
 */
public interface Subject {

    public abstract void addObserver(Observer ob);
    public abstract void removeObserver(Observer ob);
    public abstract void notifyObserver();
}
