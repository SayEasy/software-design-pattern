package com.xzq.npj.softwaredesignpattern.pattern.bridge;

/**
 * @ClassName: Circle
 * @Description:
 * @Author: xzq
 * @Date: 2020/3/31 0031 15:36
 **/
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
