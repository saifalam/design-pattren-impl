package com.saif.dp.strategy.pattern;

import com.saif.dp.strategy.pattern.uncommon.behavior.fly.FlyWithWIngs;
import com.saif.dp.strategy.pattern.uncommon.behavior.quack.Squeak;

/**
 * Created by saif on 25.11.16.
 */
public class MiniDuckSimulator {

    public static void main(String args[]) {

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("--------------------");

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.setFlyBehavior(new FlyWithWIngs());
        rubberDuck.setQuackBehavior(new Squeak());
        rubberDuck.performFly();
        rubberDuck.performQuack();

    }
}
