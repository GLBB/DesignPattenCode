package strategy_pattern.bean;

import strategy_pattern.behavior.impl.FlyWithWings;
import strategy_pattern.behavior.impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard Duck");
    }
}
