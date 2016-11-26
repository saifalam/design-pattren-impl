package com.saif.dp.strategy.pattern.uncommon.behavior.quack;

/**
 * Created by saif on 25.11.16.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("it's totally mute");
    }
}
