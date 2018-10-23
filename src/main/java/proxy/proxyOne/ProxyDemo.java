package proxy.proxyOne;

/**
 * 代理模式测试类
 *
 * 什么是代理模式：
 *    实际例子：
 *    我们去买书，实体店是真实卖书的，但是我们不是直接在实体店买书，而是通过京东购买书籍。
 *    这个京东就是代理对象，实体店是被代理对象。我们相当于客户端。
 *
 *
 * 优化1：不new RealSubject 将值传进 ProxySubject中，而是在ProxySubject类的sail方法
 *       中判断 RealSubject是否为null，为null则new RealSubject。这样就实现了让客户只管
 *       买书即可，内部书从哪里买、什么优惠卷都不用管。
 *
 * 本例子是静态代理实现
 *
 * 静态代理：若代理类在程序运行前就已经存在，那么这种代理方式被成为 静态代理
 *
 * @author yase
 * @data 2018/10/22
 */
public class ProxyDemo {

    public static void main(String[] args) {

        //创建真实主题角色（实体店） 优化1
//        RealSubject realSubject = new RealSubject();
        //创建代理主题角色（京东）
        ProxySubject proxySubject = new ProxySubject();
        //实体店委托京东代售   优化1
//        proxySubject.setRealSubject(realSubject);
        //京东买书，有优惠
        proxySubject.sailBook();
    }

}
