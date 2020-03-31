package com.xzq.npj.softwaredesignpattern.pattern.builder;

/**
 * 建造者模式
 */
public class ConcreteCarBuilder extends CarBuilder{
    @Override
    public Car buildCar(String branchName, String color) {
        Car car = new Car();
        car.setBrandName(branchName);
        car.setColor(color);
        return car;
    }

    @Override
    public Car getCar(String branchName, String color) {
        return buildCar(branchName, color);
    }
}
