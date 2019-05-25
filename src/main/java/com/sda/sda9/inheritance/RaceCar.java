package com.sda.sda9.inheritance;

public class RaceCar extends Car {
    String superColor;

    public boolean isFast() {
        return fast;
    }

    boolean fast;

    public RaceCar(int noOfWheels) {
    }


    public void something(){}

    public String maxSpeed(){ //maxSpeed overrides the method from Car class
        return "300kmph";
    }

    public String maxSpeed( int distance){ // maxSpeed(int distance) overloads the maxSpeed() method. It is different than overriding.
        maxSpeed("",3);
        return "4000";
    }

    public String maxSpeed(String x, int distance){
        distance = 5;
        return "4000";
    }
    public String maxSpeed(final int distance, String x){

        return "4000";
    }
}
