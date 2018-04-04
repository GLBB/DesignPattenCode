package abstract_factory.bean.impl;


import abstract_factory.bean.Apple;

public class NorthApple extends Apple {
    @Override
    public void get() {
        System.out.println("采集北方苹果");
    }
}
