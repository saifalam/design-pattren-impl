package com.saif.dp.decorator.pattern.concrete.component;

import com.saif.dp.decorator.pattern.component.Beverage;

/**
 * Created by saif on 10.12.16.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        setDescription("Dark Roast");
    }

    @Override
    public double cost() {
        return 0;
    }
}
