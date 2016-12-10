package com.saif.dp.decorator.pattern.concrete.component;

import com.saif.dp.decorator.pattern.component.Beverage;

/**
 * Created by saif on 10.12.16.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("House Blend");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
