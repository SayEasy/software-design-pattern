package com.xzq.npj.softwaredesignpattern.pattern.factory.abstractfactory;

import com.xzq.npj.softwaredesignpattern.pattern.factory.general.Sender;

public interface SendFactory {
    public Sender produce();
}
