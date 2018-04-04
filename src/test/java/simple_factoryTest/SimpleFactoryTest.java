package simple_factoryTest;

import org.junit.Test;
import simple_factory.bean.Fruit;
import simple_factory.factory.FruitFactory;

public class SimpleFactoryTest {
    @Test
    public void test1(){
        try {
            Fruit apple = FruitFactory.getFruit("simple_factory.bean.impl.Apple");
            Fruit banana = FruitFactory.getFruit("simple_factory.bean.impl.Banana");
            apple.get();
            banana.get();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
