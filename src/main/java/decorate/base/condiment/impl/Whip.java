package decorate.base.condiment.impl;

import decorate.base.Beverage;
import decorate.base.condiment.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }

    @Override
    public double cost() {
        return 0.30+beverage.cost();
    }
}
