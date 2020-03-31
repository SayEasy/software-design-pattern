package com.xzq.npj.softwaredesignpattern.pattern.decorator;


/**
 * 放入对象，实现相同方法，在方法前后进行修饰。
 *可对装饰者进行抽象，统一实现。也可以具体实现。
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        ShapeDecorator shapeDecorator1 = new RedShapeDecorator(new Circle());
        shapeDecorator1.draw();
        ShapeDecorator shapeDecorator2 = new RedShapeDecorator(new Rectangle());
        shapeDecorator2.draw();
    }
}
