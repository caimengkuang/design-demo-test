package factory;

/**
 * 工厂方法模式
 * 工厂方法模式同样属于类的创建型模式又被称为多态工厂模式。
 * 工厂方法模式的意义是定义一个创建产品对象的工厂接口，将
 * 实际创建工作推迟到子类当中。核心工厂类不再负责产品的创建
 * 这样核心类成为一个抽象工厂角色，仅负责工厂子类必须实现的
 * 接口，这样进一步抽象化的好处是使得工厂方法模式可以使系统
 * 在不修改具体工厂角色的情况下引进新的产品。
 * @author yase
 * @data 2018/11/20
 */
public class FactoryDemo {

    /**
     * 工厂方法模式与简单工厂模式比较
     *
     * 工厂方法模式的核心是一个抽象工厂类，简单工厂模式把核心放在一个具体类上
     *
     * 工厂方法模式之所以有一个别名叫多态性工厂模式是因为具体工厂类都有共同的接口，或者有共同的抽象父类
     *
     * 当系统扩展需要添加新的产品对象时，仅仅需要添加一个具体对象以及一个具体工厂对象，原有工厂对象不需
     * 要进行任何修改，也不需要修改客户端，很好的符合了"开发-封闭"原则。而简单工厂模式在添加新产品对象后
     * 不得不修改工厂方法，扩张性不好
     *
     * 工厂方法模式退化后可以演变成为简单工厂模式
     *
     * @param args
     */
    public static void main(String[] args) {
        //获得AppleFactory
        FruitFactory appleFactory = new AppleFactory();
        //通过AppleFactory来获取Apple实例对象
        FruitOne apple = appleFactory.getFruit();
        apple.get();

        BananaFactory bananaFactory = new BananaFactory();
        FruitOne banana = bananaFactory.getFruit();
        banana.get();

    }

}
