package flyweight.two;

/**
 *
 * 对象进行享元模式处理
 * @author yase
 * @data 2018/10/23
 */
public class MainClass {

    public static void main(String[] args) {
        TeacherFactory teacherFactory = new TeacherFactory();

        Teacher teacher1 = teacherFactory.getTeacher("1111");
//        Teacher teacher2 = teacherFactory.getTeacher("2222");
        Teacher teacher3 = teacherFactory.getTeacher("1111");

        //这里编号为 1111 的老师编号 两个老师为同一个对象
        if (teacher1 == teacher3){
            System.out.println("true");
        }
    }

}
