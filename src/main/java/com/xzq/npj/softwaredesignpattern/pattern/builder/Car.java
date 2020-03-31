package com.xzq.npj.softwaredesignpattern.pattern.builder;

/**
 * 汽车
 */
public class Car {
    /**
     * 品牌名
     */
    private String brandName;
    private String color;

    public Car() {
    }

    public Car(String brandName, String color) {
        this.brandName = brandName;
        this.color = color;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
