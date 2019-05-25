package com.sda.sda9.inheritance;

public class Car extends Vehicle {

    public Car(int noOfWheels) {
        super(noOfWheels); // super() must be the first statement in the constructor;
        int noOfWh = super.noOfWheels; // we can call super fields
        String vehicle = super.toString(); // we can call super methods
    }

    public Car(){
        super("Calling Super constructor with 2 parameters",
                "and it works even if there is no default constructor specified");
    }

    @Override
    public String maxSpeed(){
        return "125kmph";
    }  //maxSpeed will override the maxSpeed from Vehicle class
}
