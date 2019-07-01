package com.personal.basic.proxy.dynamics;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author AlaneyS
 * @Date 2019/7/1 15:23
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class ProxyDPaymentHandler implements InvocationHandler {
    private DPayment target;

    public ProxyDPaymentHandler(DPayment target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----invoke method body----");
        Object ret = null;
        beforeInvoke();
        ret = method.invoke(target, args);
        afterInvoke();
        return ret;
    }

    public void beforeInvoke(){
        System.out.println("--before invoke checking--");
    }

    public void afterInvoke(){
        System.out.println("--after invoke checking--");
    }
}
