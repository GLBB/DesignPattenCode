package decorate.base;

import decorate.base.beverage_concrete.DarkRoast;
import decorate.base.beverage_concrete.Espresso;
import decorate.base.beverage_concrete.HouseBlend;
import decorate.base.condiment.impl.Mocha;
import decorate.base.condiment.impl.Soy;
import decorate.base.condiment.impl.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());

        Beverage beverage2 = new HouseBlend(); // 0.89
        beverage2 = new Soy(beverage2);   //0.37
        beverage2 = new Mocha(beverage2); // 0.2
        beverage2 = new Whip(beverage2); // 0.3
        // total 1.76
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
    }
}
