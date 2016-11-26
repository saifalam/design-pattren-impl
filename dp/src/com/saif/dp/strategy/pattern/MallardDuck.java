package com.saif.dp.strategy.pattern;

import com.saif.dp.strategy.pattern.common.behavior.Duck;
import com.saif.dp.strategy.pattern.uncommon.behavior.fly.FlyWithWIngs;
import com.saif.dp.strategy.pattern.uncommon.behavior.quack.Quack;

/**
 * Created by saif on 25.11.16.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWIngs();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck displayed.");
    }
}
