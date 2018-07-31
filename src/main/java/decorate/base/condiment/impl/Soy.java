package decorate.base.condiment.impl;

import decorate.base.Beverage;
import decorate.base.condiment.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }

    @Override
    public double cost() {
        return 0.37+beverage.cost();
    }
}
