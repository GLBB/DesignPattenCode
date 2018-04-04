package abstract_factory.bean.impl;


import abstract_factory.bean.Banana;

public class SouthBanana extends Banana {
    @Override
    public void get() {
        System.out.println("采集南方香蕉");
    }
}
