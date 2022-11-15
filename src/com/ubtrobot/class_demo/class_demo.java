package com.ubtrobot.class_demo;

class Phone {
    private String brand;
    private double price;
    private String color;

    public Phone() {
    }

    ;

    public Phone(String brand) {
        this.brand = brand;
    }

    ;

    public Phone(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    ;

    public Phone(double price) {
        this.price = price;
    }

    ;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    ;

    public String getBrand() {
        return this.brand;
    }

    ;

    public void setPrice(double price) {
        this.price = price;
    }

    ;

    public double getPrice() {
        return this.price;
    }

    ;

    public void setColor(String color) {
        this.color = color;
    }

    ;

    public String getColor() {
        return this.color;
    }

    ;

    public void show() {
        System.out.println("正在使用价格为" + this.price + "元" + this.color + "手机打电话....");
        System.out.println("正在使用价格为" + this.price + "元" + this.color + "手机发短信....");
    }

}


public class class_demo {

    public static void main(String[] args) {
        Phone p = new Phone("小米","黑色的");
        p.setPrice(3998);
        p.show();
    }
}
