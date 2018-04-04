package factory_method.factory.impl;

import factory_method.bean.Fruit;
import factory_method.bean.impl.Banana;
import factory_method.factory.FruitFactory;


public class BananaFactory implements FruitFactory{

    @Override
    public Fruit get() {
        return new Banana();
    }
}
