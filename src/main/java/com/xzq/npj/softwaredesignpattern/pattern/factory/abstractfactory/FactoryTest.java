package com.xzq.npj.softwaredesignpattern.pattern.factory.abstractfactory;

public class FactoryTest {

    public static void main(String[] args) {
        SendFactory sendMailFactory = new SendMailFactory();
        sendMailFactory.produce().send();
        SendFactory sendSmsFactory = new SendMailFactory();
        sendMailFactory.produce().send();
    }
}
