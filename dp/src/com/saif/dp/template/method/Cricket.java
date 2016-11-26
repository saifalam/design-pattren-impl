package com.saif.dp.template.method;

/**
 * Created by saif on 07.11.16.
 */
public class Cricket  extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket: Game init");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket: Game start");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket: Game end");
    }

}

