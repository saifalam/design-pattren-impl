package com.saif.dp.decorator.pattern.concrete.decorator;

import com.saif.dp.decorator.pattern.component.Beverage;
import com.saif.dp.decorator.pattern.decorator.CondimentDecorator;

/**
 * Created by saif on 10.12.16.
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.10;
    }
}
