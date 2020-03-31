package com.xzq.npj.softwaredesignpattern.pattern.adapter.type;


/**
 *
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("当前状态：" + this.getClass() + "  " + methodName);
    }


    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }


}
