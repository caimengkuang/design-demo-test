package factory;


/**
 * @author yase
 * @data 2018/11/20
 */
public class BananaFactory implements FruitFactory {
    public FruitOne getFruit() {
        return new Banana();
    }
}
