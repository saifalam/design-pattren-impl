package com.saif.dp.strategy.pattern;

import com.saif.dp.strategy.pattern.common.behavior.Duck;
import com.saif.dp.strategy.pattern.uncommon.behavior.fly.FlyNoWay;
import com.saif.dp.strategy.pattern.uncommon.behavior.quack.MuteQuack;

/**
 * Created by saif on 25.11.16.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck displayed.");
    }
}
