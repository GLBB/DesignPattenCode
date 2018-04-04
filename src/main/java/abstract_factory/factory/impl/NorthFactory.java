package abstract_factory.factory.impl;


import abstract_factory.bean.Fruit;
import abstract_factory.bean.impl.NorthApple;
import abstract_factory.bean.impl.NorthBanana;
import abstract_factory.factory.FruitFactory;

public class NorthFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new NorthBanana();
    }
}
