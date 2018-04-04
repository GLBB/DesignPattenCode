package abstract_factory.factory.impl;


import abstract_factory.bean.Fruit;
import abstract_factory.bean.impl.SouthApple;
import abstract_factory.bean.impl.SouthBanana;
import abstract_factory.factory.FruitFactory;

public class SouthFactory implements FruitFactory {

    @Override
    public Fruit getApple() {
        return new SouthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SouthBanana();
    }
}
