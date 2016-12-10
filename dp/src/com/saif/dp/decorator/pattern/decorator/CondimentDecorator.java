package com.saif.dp.decorator.pattern.decorator;

import com.saif.dp.decorator.pattern.component.Beverage;

/**
 * Created by saif on 10.12.16.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
