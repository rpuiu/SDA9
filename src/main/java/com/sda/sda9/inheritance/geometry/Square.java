package com.sda.sda9.inheritance.geometry;

public class Square extends Shape {

    private int edgeSize;

    public Square(int edgeSize) {
        this.edgeSize = edgeSize;
    }

    @Override
    public void calculateArea(){
        System.out.println("Square: "+ Math.pow(edgeSize,2)); //edgeSize * edgeSize
    }
}
