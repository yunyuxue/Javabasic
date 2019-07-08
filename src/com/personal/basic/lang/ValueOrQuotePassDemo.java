package com.personal.basic.lang;

/**
 * @Author AlaneyS
 * @Date 2019/7/5 16:55
 * @Description interview test question.
 * @Modified By
 * @Version: 1.0.0
 **/
public class ValueOrQuotePassDemo {
    public static void main(String[] args) {
        System.out.println("A:---------");
        Integer a =2018;
        passInteger(a);
        System.out.println(a);
        a=passInteger(a);
        System.out.println(a);

        System.out.println("B:---------");
        SIPojo SIPojo1 = new SIPojo(2019,"2019");
        passSIPojo(SIPojo1);
        System.out.println("SIPojo1 x: " + SIPojo1.getX() + " y: " + SIPojo1.getY());

        System.out.println("C:---------");
        SIPojo SIPojo2 = new SIPojo(2021,"2021");
        SIPojo2 = passSIPojo(SIPojo2);
        System.out.println("SIPojo2 x: " + SIPojo2.getX() + " y: " + SIPojo2.getY());

        System.out.println("D:---------");
        SIPojo SIPojo3 = new SIPojo(2022,"2022");
        passSIPojoAndReassign(SIPojo3);
        System.out.println("a -- SIPojo3 x: " + SIPojo3.getX() + " y: " + SIPojo3.getY());
        SIPojo3 = passSIPojoAndReassign(SIPojo3);
        System.out.println("b -- SIPojo3 x: " + SIPojo3.getX() + " y: " + SIPojo3.getY());
    }

    private static Integer passInteger(Integer arg) {
        arg = 2019;
        return arg;
    }

    private static SIPojo passSIPojo(SIPojo SIPojoA){
        SIPojoA.setX(2020);
        SIPojoA.setY("2020");
        return SIPojoA;
    }

    private static SIPojo passSIPojoAndReassign(SIPojo SIPojoB){
        SIPojoB = new SIPojo(2023, "2023");
        return SIPojoB;
    }
}
