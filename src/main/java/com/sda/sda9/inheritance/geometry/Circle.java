package com.sda.sda9.inheritance.geometry;

public class Circle extends Shape {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea(){
        System.out.println("Circle: " + Math.PI*Math.pow(radius,2));
    }
}
