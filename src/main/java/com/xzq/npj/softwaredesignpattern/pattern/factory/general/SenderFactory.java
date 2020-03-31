package com.xzq.npj.softwaredesignpattern.pattern.factory.general;

/**
 * 普通工厂类
 */
public class SenderFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }

    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        senderFactory.produce("mail").send();
        senderFactory.produce("sms").send();
    }

}
