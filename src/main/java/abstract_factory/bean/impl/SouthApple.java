package abstract_factory.bean.impl;


import abstract_factory.bean.Apple;

public class SouthApple extends Apple {
    @Override
    public void get() {
        System.out.println("采集南方苹果");
    }
}
