package com.sda.sda9.inheritance.teststatic;

import com.sda.sda9.inheritance.Car;

public class Animal {

    static int NUMBER_OF_EYES = 2;
    static Car CAR = new Car(4);

    static {
        Car car = new Car(1);
        System.out.println(car.maxSpeed());
    }

    static String getColor() {
        return "REd";
    }

    public Animal() {
        System.out.println("AnimalConstrutor");
    }
}
