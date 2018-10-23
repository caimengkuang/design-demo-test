package proxy.one;

/**
 * 真实主题角色：
 *    定义了代理角色所代表的真实对象
 * @author yase
 * @data 2018/10/22
 */
public class RealSubject implements Subject {

    /**
     * 实体店 卖书功能
     */
    public void sailBook() {
        System.out.println("实体店的书京东在卖");
    }

}
