package com.sda.sda9.inheritance;

public class Car extends Vehicle {
    String color;

    public Car(int noOfWheels) {
        super(noOfWheels);
        this.color = "RED";
    }

    public String getColor() {
        return color;
    }
//    public Car(){
//        System.out.println("Car");
//    }
}
