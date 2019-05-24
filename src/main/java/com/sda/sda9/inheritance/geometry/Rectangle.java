package com.sda.sda9.inheritance.geometry;

public class Rectangle extends Shape{
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void calculateArea(){
        System.out.println("Rectangle: "+ height*width);
    }
}
