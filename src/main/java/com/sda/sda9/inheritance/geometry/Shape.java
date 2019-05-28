package com.sda.sda9.inheritance.geometry;

public abstract class Shape {
    public abstract String getNane();
    public abstract int getNrOfEdges();

    public void calculateArea(){
        System.out.println("Shape unknown, unable to get area");
    }

}
