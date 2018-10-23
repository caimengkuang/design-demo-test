package proxy.one;

import proxy.two.RealSubject;
import proxy.two.Subject;

/**
 * 代理主题角色：
 *    含有对真实主题角色的引用，代理角色通常
 *    再将客户端调用传递给真实主题对象之前或者
 *    之后执行某些操作，而不是单纯返回真实的对象。
 * @author yase
 * @data 2018/10/22
 */
public class ProxySubject implements Subject {

    /**
     * 真实主题角色
     */
    private RealSubject realSubject;

//    /**
//     * 优化1：不再这里new
//     * @param realSubject
//     */
//    public void setRealSubject(RealSubject realSubject){
//        this.realSubject = realSubject;
//    }

    /**
     * 卖书，其实是调用真实主题角色的卖书方法
     */
    public void sailBook() {

        //京东卖书打折
        discount();

        //优化1
        if (null == realSubject){
            realSubject = new RealSubject();
        }

        //实体店卖书
        this.realSubject.sailBook();
        //京东赠送优惠卷
        give();
    }

    /**
     * 打折
     */
    public void discount(){
        System.out.println("京东打折");
    }


    /**
     * 赠送优惠卷
     */
    public void give(){
        System.out.println("京东赠送优惠卷");
    }

}
