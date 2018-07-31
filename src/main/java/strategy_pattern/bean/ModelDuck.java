package strategy_pattern.bean;

import strategy_pattern.behavior.FlyBehavior;
import strategy_pattern.behavior.impl.FlyNoWay;
import strategy_pattern.behavior.impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm Model Duck");
    }
}
