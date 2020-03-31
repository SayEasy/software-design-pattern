package com.xzq.npj.softwaredesignpattern.pattern.adapter.interf;


/**
 * 需要实现的接口
 */
public interface WindowListener {
    public void max();
    public void min();
    public void resize();
    public void restore();
    public void move();
    public void close();
}
