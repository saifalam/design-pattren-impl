package com.saif.dp.decorator.pattern.concrete.component;

import com.saif.dp.decorator.pattern.component.Beverage;

/**
 * Created by saif on 10.12.16.
 */
public class Espresso  extends Beverage {

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
