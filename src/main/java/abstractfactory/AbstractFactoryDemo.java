package abstractfactory;

/**
 * @author yase
 * @data 2018/11/21
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        FruitFactory ff = new SouthFactory();
        Fruit apple = ff.getApple();
        apple.get();

        Fruit banana = ff.getBanana();
        banana.get();

        NorthFactory ff1 = new NorthFactory();
        Fruit apple1 = ff1.getApple();
        apple1.get();
        Fruit banana1 = ff1.getBanana();
        banana1.get();
    }

}
