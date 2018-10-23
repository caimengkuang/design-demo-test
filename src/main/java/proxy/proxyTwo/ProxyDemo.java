package proxy.proxyTwo;

import java.lang.reflect.Proxy;

/**
 * 代理模式
 *
 * 动态代理：代理类在程序运行时创建的代理方式被称为动态代理
 *
 * 动态代理实现:
 *  1.实现InvocationHandler接口
 *  2.invoke方法
 *  3.Proxy.newProxyInstance();
 * @author yase
 * @data 2018/10/22
 */
public class ProxyDemo {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        MyHandler myHandler = new MyHandler();
        myHandler.setRealSubject(realSubject);

        Subject proxySubject = (Subject)Proxy.newProxyInstance(RealSubject.class.getClassLoader(),realSubject.getClass().getInterfaces(),myHandler);

        proxySubject.sailBook();
    }

}
