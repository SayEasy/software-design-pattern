package com.xzq.npj.softwaredesignpattern.pattern.prototype.one;

import java.util.Scanner;

public class Square implements Shape {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void countArea() {
        int a = 0;
        System.out.print("这是一个正方形，请输入它的边长：");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("该正方形的面积=" + a * a + "\n");
    }
}
