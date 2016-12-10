package com.saif.dp.decorator.pattern.concrete.component;

import com.saif.dp.decorator.pattern.component.Beverage;

/**
 * Created by saif on 10.12.16.
 */
public class Decaf extends Beverage {


    public Decaf( ) {
        setDescription("Decaf");
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
