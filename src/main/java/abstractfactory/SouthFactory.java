package abstractfactory;

/**
 * @author yase
 * @data 2018/11/21
 */
public class SouthFactory implements FruitFactory {


    public Fruit getApple() {
        return new SouthApple();
    }

    public Fruit getBanana() {
        return new SouthBanana();
    }
}
