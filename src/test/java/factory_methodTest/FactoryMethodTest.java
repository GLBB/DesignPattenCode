package factory_methodTest;

import factory_method.bean.Fruit;
import factory_method.bean.impl.Apple;
import factory_method.factory.impl.AppleFactory;
import factory_method.factory.impl.BananaFactory;
import org.junit.Test;



public class FactoryMethodTest {
    @Test
    public void test1(){
        Fruit apple = new AppleFactory().get();
        Fruit banana = new BananaFactory().get();
        apple.get();
        banana.get();
    }
}
