package com.xzq.npj.softwaredesignpattern.pattern.adapter.obj;

public class SourceSub1 extends Wrapper {
    @Override
    public void method1() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("当前状态：" + this.getClass() + "  " + methodName);
    }
}
