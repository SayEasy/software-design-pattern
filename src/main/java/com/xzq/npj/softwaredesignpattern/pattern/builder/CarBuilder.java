package com.xzq.npj.softwaredesignpattern.pattern.builder;

import com.xzq.npj.softwaredesignpattern.pattern.factory.Product;

/**
 *
 */
public abstract class CarBuilder {
    public abstract Car buildCar(String branchName, String color);
    public abstract Car getCar(String branchName, String color);
}
