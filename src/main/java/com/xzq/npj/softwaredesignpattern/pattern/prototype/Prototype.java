package com.xzq.npj.softwaredesignpattern.pattern.prototype;

import java.io.*;

/**
 * 对原有对象进行克隆
 */
public class Prototype<T> implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String str;


//    private SerializableObject obj;

    /* 浅复制 */
    public T clone() throws CloneNotSupportedException {
        T proto = (T) super.clone();
        return proto;
    }


    /* 深复制 */
    public T deepClone() throws IOException, ClassNotFoundException {
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (T)ois.readObject();
    }

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Prototype<Pig> pigPrototype = new Prototype<>();
        Pig clone = pigPrototype.clone();
        Pig pig = pigPrototype.deepClone();
    }

}
