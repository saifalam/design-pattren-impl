package com.saif.dp.decorator.pattern;

import com.saif.dp.decorator.pattern.component.Beverage;
import com.saif.dp.decorator.pattern.concrete.component.Espresso;
import com.saif.dp.decorator.pattern.concrete.component.HouseBlend;
import com.saif.dp.decorator.pattern.concrete.decorator.Mocha;
import com.saif.dp.decorator.pattern.concrete.decorator.Whip;

/**
 * Created by saif on 10.12.16.
 */
public class CoffeeShop {

    public static void main(String args[]){

        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $"+ espresso.cost());

        espresso = new Mocha(espresso);
        System.out.println(espresso.getDescription() + " $"+ espresso.cost());


        Beverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription() + " $"+ houseBlend.cost());

        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $"+ houseBlend.cost());

    }
}
