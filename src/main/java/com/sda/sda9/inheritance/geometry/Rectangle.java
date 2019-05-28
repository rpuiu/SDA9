package com.sda.sda9.inheritance.geometry;

public class Rectangle extends Shape implements Polygon{
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String getNane() {
        return null;
    }

    @Override
    public int getNrOfEdges() {
        return 0;
    }

    public void calculateArea(){
        System.out.println("Rectangle: "+ height*width);
    }


    @Override
    public void getNoOfEdges() {

    }
}
