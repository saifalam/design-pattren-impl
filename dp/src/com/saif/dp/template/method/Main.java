package com.saif.dp.template.method;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Game game = new Football();
        game.play();
        System.out.println("---------------------------");
        game = new Cricket();
        game.play();
    }
}
