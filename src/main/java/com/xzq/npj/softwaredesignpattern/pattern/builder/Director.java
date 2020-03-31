package com.xzq.npj.softwaredesignpattern.pattern.builder;

/**
 * 负责调用适当的建造者来组建产品，导演类一般不与产品类发生依赖关系，与导演类直接交互的是建造者类。一般来说，导演类被用来封装程序中易变的部分。
 */
public class Director {
    private static CarBuilder builder = new ConcreteCarBuilder();

    public static Car getCar1(){
        return builder.getCar("宝马汽车","时尚红");
    }

    public static Car getCar2(){
        return builder.getCar("奔驰汽车","绚烂黑");
    }


    public static void main(String[] args) {
        System.out.println(getCar1().toString());
        System.out.println(getCar2().toString());
    }
}
