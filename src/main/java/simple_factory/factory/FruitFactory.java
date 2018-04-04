package simple_factory.factory;

import simple_factory.bean.Fruit;
import simple_factory.bean.impl.Apple;
import simple_factory.bean.impl.Banana;

/**
 * 简单工厂
 */
public class FruitFactory {
    public static Fruit getFruit(String fruit) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        /* 写法一
        if("Apple".equalsIgnoreCase(fruit)){
            return Apple.class.newInstance();
        }else if ("Banana".equalsIgnoreCase(fruit)){
            return Banana.class.newInstance();
        }else {
            return null;
        }
        */

        // 写法二
        Class clazz = Class.forName(fruit);
        return (Fruit) clazz.newInstance();
    }
}
