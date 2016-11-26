package com.saif.dp.strategy.pattern.uncommon.behavior.fly;

/**
 * Created by saif on 25.11.16.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("NO fly");
    }
}
