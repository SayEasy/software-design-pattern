package com.xzq.npj.softwaredesignpattern.pattern.proxy;

/**
 * 需要被代理的类
 */
public class Source implements  SourceInterf{
    private String name;

    public Source() {
    }

    @Override
    public String getName(){
        return this.name;
    }

}
