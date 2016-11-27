package com.saif.dp.observer.pattern.subject;

import com.saif.dp.observer.pattern.observers.Observer;

/**
 * Created by saif on 27.11.16.
 */
public interface Subject {

    void addObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObserver();
}
