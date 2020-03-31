package com.xzq.npj.softwaredesignpattern.pattern.decorator;


public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        befor();
        shape.draw();
        after();
    }

    private void befor(){
        System.out.println("============befor==========");
    }
    private void after(){
        System.out.println("============after==========");
    }
}
