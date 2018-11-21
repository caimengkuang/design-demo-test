package abstractfactory;

/**
 * @author yase
 * @data 2018/11/21
 */
public class NorthFactory implements FruitFactory {
    public Fruit getApple() {
        return new NorthApple();
    }

    public Fruit getBanana() {
        return new NorthBanana();
    }
}
