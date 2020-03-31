package com.xzq.npj.softwaredesignpattern.pattern.factory.general;

public class SmsSender implements  Sender{
    @Override
    public void send() {
        System.out.println("Sms 发送");
    }
}
