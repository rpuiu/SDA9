package com.sda.sda9.inheritance.geometry;

public class Square extends Shape implements Polygon{

    private int edgeSize;

    public Square(int edgeSize) {
        this.edgeSize = edgeSize;
    }

    @Override
    public String getNane() {
        return null;
    }

    @Override
    public int getNrOfEdges() {
        return 0;
    }

    @Override
    public void calculateArea(){
        System.out.println("Square: "+ Math.pow(edgeSize,2)); //edgeSize * edgeSize
    }

    @Override
    public void getNoOfEdges() {
        System.out.println("4 Edges");
    }
}
