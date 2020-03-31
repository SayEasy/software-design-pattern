package com.xzq.npj.softwaredesignpattern.pattern.adapter.type;


/**
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题。
 */
public class Wrapper implements Targetable {

    private Source source;
    public Wrapper(Source source) {
        super();
        this.source = source;

    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("当前状态：" + this.getClass() + "  " + methodName);
    }

    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper(new Source());
        wrapper.method1();
        wrapper.method2();
    }
}
