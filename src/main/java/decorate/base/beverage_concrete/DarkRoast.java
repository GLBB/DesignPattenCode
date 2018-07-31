package decorate.base.beverage_concrete;

import decorate.base.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        this.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
