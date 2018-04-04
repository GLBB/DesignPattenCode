package abstract_factory;


import abstract_factory.bean.Fruit;
import abstract_factory.factory.impl.NorthFactory;
import abstract_factory.factory.impl.SouthFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        SouthFactory southFactory = new SouthFactory();
        Fruit southApple = southFactory.getApple();
        Fruit southBanana = southFactory.getBanana();

        southApple.get();
        southBanana.get();

        NorthFactory northFactory = new NorthFactory();
        Fruit northApple = northFactory.getApple();
        Fruit northBanana = northFactory.getBanana();
        northApple.get();
        northBanana.get();

    }
}
