package proxy.two;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yase
 * @data 2018/10/22
 */
public class MyHandler implements InvocationHandler {

    private RealSubject realSubject;

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;

        discount();

        result = method.invoke(realSubject,args);

        give();

        return result;
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
