package com.saif.dp.decorator.pattern.component;

/**
 * Created by saif on 10.12.16.
 */
public abstract class Beverage {
    private String description = "";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
