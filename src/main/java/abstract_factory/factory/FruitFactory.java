package abstract_factory.factory;


import abstract_factory.bean.Fruit;

public interface FruitFactory {
    public Fruit getApple();

    public Fruit getBanana();
}
