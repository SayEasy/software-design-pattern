package com.xzq.npj.softwaredesignpattern.pattern.factory.abstractfactory;

import com.xzq.npj.softwaredesignpattern.pattern.factory.general.Sender;
import com.xzq.npj.softwaredesignpattern.pattern.factory.general.SmsSender;

/**
 * 抽象工厂
 */
public class SendSmsFactory implements SendFactory {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
