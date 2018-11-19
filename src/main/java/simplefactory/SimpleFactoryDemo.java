package simplefactory;

/**
 * 简单工厂模式：
 * 简单工厂模式属于类的创建型模式，又叫静态工厂方法模式
 * 通过专门定义一个类来负责创建其他类的实例，被创建的实例
 * 通常都具有共同都父类
 *
 * 简单工厂模式角色及其职责：
 * 工厂角色：
 *    简单工厂模式都核心，它负责实现创建所有实例都内部逻辑。
 *    工厂类可以被外界直接调用，创建所需都产品对象
 * 抽象角色：
 *    简单工厂模式所创建都所有对象都父类，它负责描述所有实例所
 *    共有的公共接口
 * 具体产品角色：
 *    简单工厂模式所创建的具体实例对象
 *
 * @author yase
 * @data 2018/11/19
 */
public class SimpleFactoryDemo {

    public static void main(String[] args) throws Exception {
        //简单工厂实现方式1
        Apple apple = FruitFactory.getApple();
        Banana banana = FruitFactory.getBanana();
        apple.get();
        banana.get();

        //简单工厂实现方式2  一般使用这个方式 这里只要和factory的匹配规则一致即可
        Fruit apple1 = FruitFactory.getFruit("apple");
        Fruit banana1 = FruitFactory.getFruit("banana");
        apple1.get();
        banana1.get();

        //简单工厂实现方式3 不灵活，一定要传类名 Apple、Banana 不然会找不到类
        Fruit apple2 = FruitFactory.getFruit("Apple");
        Fruit banana2 = FruitFactory.getFruit("Banana");
        apple2.get();
        banana2.get();

    }


}
