package flyweight.one;

/**
 * 享元模式：
 *    它通过与其他类似对象共享数据来减少内存占用。
 *    就比如说一个文件都是有字母组成，a b c d... A B C D ...
 *    比如 apple 其中 p都是同一个对象，这样的话52个字母，只会
 *    有52个对象，减少内存占用
 *
 * 实现方式：存在一个hashMpa,将数据key:一个对象的标识，value：为自己
 *         每次创建一个新值都先去hashMap中根据自己的值，去判断下是否存在
 *         存在返回自己，不存在创建一个对象。
 * @author yase
 * @data 2018/10/23
 */
public class FlyWeightDemo {

    public static void main(String[] args) {
        //不用享元模式之前
        MyCharacter myCharacter1 = new MyCharacter('a');
        MyCharacter myCharacter2 = new MyCharacter('b');
        MyCharacter myCharacter3 = new MyCharacter('a');
        MyCharacter myCharacter4 = new MyCharacter('d');

        myCharacter1.display();
        myCharacter2.display();
        myCharacter3.display();
        myCharacter4.display();

        //两个 a 不是同一个对象
        if (myCharacter1 == myCharacter3){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


        //----------------

        //1.创建MyCharacter工厂
        MyCharacterFactory factory = new MyCharacterFactory();
        //2.从工厂中取出相应的MyCharacter
        MyCharacter myCharacter5 = factory.getMyCharacter('a');
        MyCharacter myCharacter6 = factory.getMyCharacter('b');
        MyCharacter myCharacter7 = factory.getMyCharacter('a');
        MyCharacter myCharacter8 = factory.getMyCharacter('d');

        myCharacter5.display();
        myCharacter6.display();
        myCharacter7.display();
        myCharacter8.display();

        //其中a 都是同一个对象，那么 myCharacter1 == myCharacter3
        if (myCharacter5 == myCharacter7){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }

}
