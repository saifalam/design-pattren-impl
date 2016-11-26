package com.saif.dp.template.method;

/**
 * Created by saif on 07.11.16.
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football: Game init");
    }

    @Override
    void startPlay() {
        System.out.println("Football: Game start");
    }

    @Override
    void endPlay() {
        System.out.println("Football: Game end");
    }

}
