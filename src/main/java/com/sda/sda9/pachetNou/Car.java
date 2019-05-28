package com.sda.sda9.pachetNou;

public class Car extends  Vehicle implements  Paintable {

    public int getSpeed(){
        return 100;
    }

    @Override
    public void paint() {
        System.out.println("Car paint");
    }
}
