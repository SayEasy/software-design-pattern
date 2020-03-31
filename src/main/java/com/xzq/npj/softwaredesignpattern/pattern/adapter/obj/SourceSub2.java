package com.xzq.npj.softwaredesignpattern.pattern.adapter.obj;

public class SourceSub2 extends Wrapper {
    @Override
    public void method2() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("当前状态：" + this.getClass() + "  " + methodName);
    }
}
