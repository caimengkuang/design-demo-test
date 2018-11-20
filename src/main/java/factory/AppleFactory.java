package factory;

import simplefactory.Fruit;

/**
 * @author yase
 * @data 2018/11/20
 */
public class AppleFactory implements FruitFactory {
    public FruitOne getFruit() {
        return new Apple();
    }
}
