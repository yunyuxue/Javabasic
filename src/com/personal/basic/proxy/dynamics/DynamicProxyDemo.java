package com.personal.basic.proxy.dynamics;

import java.lang.reflect.Proxy;

/**
 * @Author AlaneyS
 * @Date 2019/7/1 15:33
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class DynamicProxyDemo {
    public static void main(String[] args) {
        DPayment dPayment = new DUserPayment();
        DPayment dPaymentProxy = (DPayment) Proxy.newProxyInstance(DynamicProxyDemo.class.getClassLoader(), dPayment.getClass().getInterfaces(), new ProxyDPaymentHandler(dPayment));
        System.out.println("pay process...");
        dPaymentProxy.dPay();
        System.out.println("refund process...");
        dPaymentProxy.refund();
    }
}
