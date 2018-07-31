package strategy_pattern;

import org.junit.Test;
import strategy_pattern.bean.Duck;
import strategy_pattern.bean.MallardDuck;
import strategy_pattern.bean.ModelDuck;
import strategy_pattern.behavior.impl.FlyRocketPowered;

public class MiniDuckSemulator {
    @Test
    public void test1(){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }

    @Test
    public void test2(){
        System.out.println("-----------------Mallard Duck----------------------");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("-----------------Model Duck------------------------");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
