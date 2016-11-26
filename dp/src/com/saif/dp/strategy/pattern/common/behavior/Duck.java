package com.saif.dp.strategy.pattern.common.behavior;

import com.saif.dp.strategy.pattern.uncommon.behavior.fly.FlyBehavior;
import com.saif.dp.strategy.pattern.uncommon.behavior.quack.QuackBehavior;

/**
 * Created by saif on 25.11.16.
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void swim() {
        System.out.println("All ducks can Swim");
    }

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flv) {
        flyBehavior = flv;
    }
    public void setQuackBehavior(QuackBehavior qlv) {
        quackBehavior = qlv;
    }

}
