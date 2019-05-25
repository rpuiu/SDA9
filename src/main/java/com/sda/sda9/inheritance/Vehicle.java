package com.sda.sda9.inheritance;

public class Vehicle {

    int noOfWheels;

    public Vehicle(int noOfWheels) {
        this(1, "3"); // calling the other constructor with 2 parameters from Vehicle. this() must be the first statement in the constructor

//        this("Aa", "b"); // Vehicle(String a, String b)
        this.noOfWheels = noOfWheels; // we can call this fields
        this.toString(); // we can call this methods
    }

    public Vehicle(String a, String b){}
    public Vehicle(int a, String b){}

    public static void main(String[] args) {
        Vehicle vehicle;
        vehicle=new Vehicle(1);
        vehicle=new Vehicle(1,"");
        vehicle=new Vehicle("","");  // we can initialize Vehicle by calling any constructor we want if they are public

    }

    @Override
    public String toString() {
        return "Aaa";
    }

    public String maxSpeed(){
        return "0kmph";
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
}
