package com.saif.dp.template.method;

/**
 * Created by saif on 07.11.16.
 */
abstract public class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public void halfTime(){
        System.out.println("From Game Common: interval after first half");
    }

    //Template Method
     public final void play(){

         initialize();
         startPlay();
         halfTime();
         endPlay();
    }
}
