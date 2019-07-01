package com.personal.basic.proxy.dynamics;

import com.personal.basic.proxy.statics.Payment;

/**
 * @Author AlaneyS
 * @Date 2019/7/1 12:47
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class DUserPayment implements DPayment {
    @Override
    public void refund() {
        System.out.println("refund function is working...");
    }

    @Override
    public void dPay() {
        System.out.println("it is a real payment instance..");
    }
}
