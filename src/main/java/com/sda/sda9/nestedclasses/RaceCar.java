package com.sda.sda9.nestedclasses;

public class RaceCar extends Car{

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    public RaceCar(int maxSpeed) {
        super(maxSpeed);
    }

    public void something(){
        Wheel w = new Wheel();
        w.flatTire();
    }

}
