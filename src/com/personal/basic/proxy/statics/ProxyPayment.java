package com.personal.basic.proxy.statics;

/**
 * @Author AlaneyS
 * @Date 2019/7/1 12:48
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class ProxyPayment implements Payment {

    private Payment payment;

    public ProxyPayment(Payment payment){
        this.payment = payment;
    }

    public void beforePay(){
        System.out.println("check payment before pay...");
    }

    @Override
    public void pay() {
        beforePay();
        payment.pay();
        afterPay();
    }

    public void afterPay(){
        System.out.println("check payment after pay...");
    }
}
