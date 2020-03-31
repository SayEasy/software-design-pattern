package com.xzq.npj.softwaredesignpattern.pattern.singleton;

/**
 * 单例模式  饿汉，懒汉，枚举
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }


    //双重判断
    public static Singleton getInstance() {
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //方法锁
    public static synchronized Singleton getInstance2() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
