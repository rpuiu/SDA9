package com.sda.sda9.inheritance;

public class Main {

    public static void main(String[] args) {
        RaceCar r = new RaceCar(3);
        Car c = new Car(4);
        Vehicle v = new Vehicle(3);

        System.out.println(v.maxSpeed());
        System.out.println(c.maxSpeed());
        System.out.println(r.maxSpeed());
        r.isFast();
        System.out.println(r.maxSpeed(1));
        System.out.println(r.maxSpeed(1, "A"));
        System.out.println(r.maxSpeed("a", 1));
    }
}
