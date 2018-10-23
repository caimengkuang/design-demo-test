package flyweight.one;

/**
 * 具体享元角色
 * @author yase
 * @data 2018/10/23
 */
public class MyCharacter {

    private char myChar;

    public MyCharacter(char myChar){
        this.myChar = myChar;
    }

    public void display(){
        System.out.println(myChar);
    }

}
