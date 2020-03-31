package com.xzq.npj.softwaredesignpattern.pattern.adapter.obj;



/**
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题。
 */
public abstract class Wrapper implements Sourceable {
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
