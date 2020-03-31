package com.xzq.npj.softwaredesignpattern.pattern.decorator;

/**
 * 圆
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
