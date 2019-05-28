package com.sda.sda9.inheritance.geometry;

public class Circle extends Shape {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getNane() {
        return null;
    }

    @Override
    public int getNrOfEdges() {
        return Integer.parseInt(null);
    }

    public void calculateArea(){
        System.out.println("Circle: " + Math.PI*Math.pow(radius,2));
    }

}
