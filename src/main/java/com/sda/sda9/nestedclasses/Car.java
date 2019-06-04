package com.sda.sda9.nestedclasses;

public class Car {
    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    private int maxSpeed;

    public int getMaxSpeed() {
        Wheel w = new Wheel();
        w.flatTire();

        return maxSpeed;
    }

    public class Wheel{ //Inner class (Can be private; can be static/non-static)

        public void flatTire(){
            maxSpeed *=0.5;
        }
    }
}
