package simple_factory.bean.impl;

import simple_factory.bean.Fruit;

public class Banana implements Fruit {
    @Override
    public void get() {
        System.out.println("采集香蕉");
    }
}
