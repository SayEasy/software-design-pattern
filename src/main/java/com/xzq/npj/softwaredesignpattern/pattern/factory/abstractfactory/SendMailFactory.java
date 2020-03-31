package com.xzq.npj.softwaredesignpattern.pattern.factory.abstractfactory;

import com.xzq.npj.softwaredesignpattern.pattern.factory.general.MailSender;
import com.xzq.npj.softwaredesignpattern.pattern.factory.general.Sender;

/**
 * 抽象工厂
 */
public class SendMailFactory implements SendFactory {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
