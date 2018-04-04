package abstract_factory.bean.impl;


import abstract_factory.bean.Banana;

public class NorthBanana extends Banana {
    @Override
    public void get() {
        System.out.println("采集北方香蕉");
    }
}
