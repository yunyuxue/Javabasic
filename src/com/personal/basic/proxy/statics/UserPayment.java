package com.personal.basic.proxy.statics;

/**
 * @Author AlaneyS
 * @Date 2019/7/1 12:47
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class UserPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("it is a real payment instance..");
    }
}
