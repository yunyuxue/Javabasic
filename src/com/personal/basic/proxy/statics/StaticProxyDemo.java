package com.personal.basic.proxy.statics;

/**
 * @Author AlaneyS
 * @Date 2019/7/1 15:18
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class StaticProxyDemo {
    public static void main(String[] args) {
        ProxyPayment proxyPayment = new ProxyPayment(new UserPayment());
        proxyPayment.pay();
    }
}
