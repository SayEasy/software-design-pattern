package com.xzq.npj.softwaredesignpattern.pattern.prototype.one;

public interface Shape extends  Cloneable{

    public Object clone() throws CloneNotSupportedException;    //拷贝
    public void countArea();    //计算面积

}
