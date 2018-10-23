package flyweight.two;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yase
 * @data 2018/10/23
 */
public class TeacherFactory {

    private Map<String,Teacher> pool;

    public TeacherFactory(){
        pool = new  HashMap<String,Teacher>();
    }

    //这里可以传递其他几个参数比如老师的年龄、性别、名字
    public Teacher getTeacher(String number){
        Teacher teacher = pool.get(number);

        if (null == teacher){
            teacher = new Teacher();
            teacher.setNum(number);
            pool.put(number,teacher);
        }

        return teacher;

    }



}
