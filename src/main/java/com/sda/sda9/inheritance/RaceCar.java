package com.sda.sda9.inheritance;

public class RaceCar extends Car {
    String superColor;

    public RaceCar(int noOfWheels) {
        super(noOfWheels);
        superColor = super.getColor();
        String newColor = super.color;
        this.something();
    }


    public void something(){}

//    public RaceCar(){
//        System.out.println("RaceCar");
//    }
}
