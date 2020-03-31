package com.xzq.npj.softwaredesignpattern.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SourceProxy implements InvocationHandler {
    private SourceInterf source ;

    public SourceProxy(SourceInterf source) {
        this.source = source;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(source,args);
    }


    public static void main(String[] args) {
        SourceInterf source = new Source();
        InvocationHandler handler = new SourceProxy(source);
        Class<? extends SourceInterf> aClass = source.getClass();
        Class<? extends InvocationHandler> aClass1 = handler.getClass();
        SourceInterf o = (SourceInterf)Proxy.newProxyInstance(aClass1.getClassLoader(), aClass.getInterfaces(), handler);

        System.out.println(o.getName() );


    }
}
