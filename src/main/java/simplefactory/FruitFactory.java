package simplefactory;

/**
 *
 * @author yase
 * @data 2018/11/19
 */
public class FruitFactory {



    //------------------------简单工厂模式实现 1-----------------------

    public static Apple getApple(){
        return new Apple();
    }

    public static Banana getBanana(){
        return new Banana();
    }

    //------------------------简单工厂模式实现 2-----------------------

    public static Fruit getFruit(String type) throws Exception {
        if ("apple".equalsIgnoreCase(type)){
            return Apple.class.newInstance();
        }else if ("banana".equalsIgnoreCase(type)){
            return Banana.class.newInstance();
        }else {
            throw new Exception("找不到相应的实例化类");
        }
    }

    //------------------------简单工厂模式实现 3-----------------------

    public static Fruit findFruit(String type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class fruit = Class.forName(type);

        return (Fruit)fruit.newInstance();
    }

}
