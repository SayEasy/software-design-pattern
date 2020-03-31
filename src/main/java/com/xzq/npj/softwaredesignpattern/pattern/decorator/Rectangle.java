package com.xzq.npj.softwaredesignpattern.pattern.decorator;

/**
 *
 * 长方形
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
