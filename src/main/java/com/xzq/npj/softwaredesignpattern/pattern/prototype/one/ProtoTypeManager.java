package com.xzq.npj.softwaredesignpattern.pattern.prototype.one;

import java.util.HashMap;

public class ProtoTypeManager {
    private HashMap<String, Shape> ht = new HashMap<String, Shape>();

    public ProtoTypeManager() {
        ht.put("Circle", new Circle());
        ht.put("Square", new Square());
    }

    public void  addshape(String key,Shape obj) {
        ht.put(key, obj);
    }

    public Shape getShape(String key) throws CloneNotSupportedException {
        Shape temp = ht.get(key);
        return (Shape) temp.clone();
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        ProtoTypeManager pm=new ProtoTypeManager();
        Shape obj1=(Circle)pm.getShape("Circle");
        obj1.countArea();
        Shape obj2=(Shape)pm.getShape("Square");
        obj2.countArea();
    }
}
