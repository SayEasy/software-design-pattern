package com.xzq.npj.softwaredesignpattern.pattern.factory.general;

public class MailSender implements  Sender{
    @Override
    public void send() {
        System.out.println("Mail 发送");
    }
}
