package factory_method.factory.impl;

import factory_method.bean.Fruit;
import factory_method.bean.impl.Apple;
import factory_method.factory.FruitFactory;


public class AppleFactory implements FruitFactory{
    @Override
    public Fruit get() {
        return new Apple();
    }
}
