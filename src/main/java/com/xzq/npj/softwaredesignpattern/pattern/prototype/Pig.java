package com.xzq.npj.softwaredesignpattern.pattern.prototype;



public class Pig {
    private String name;
    private Double weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
