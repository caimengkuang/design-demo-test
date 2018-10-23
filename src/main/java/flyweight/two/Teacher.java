package flyweight.two;

/**
 *
 * 具体享元角色
 * @author yase
 * @data 2018/10/23
 */
public class Teacher extends PerSon {

    private String num;

    public Teacher(String num){
        this.num = num;
    }

    public Teacher(){

    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
