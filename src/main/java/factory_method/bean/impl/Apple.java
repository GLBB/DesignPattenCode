package factory_method.bean.impl;

import factory_method.bean.Fruit;

public class Apple implements Fruit {
    @Override
    public void get() {
        System.out.println("采集苹果");
    }
}
