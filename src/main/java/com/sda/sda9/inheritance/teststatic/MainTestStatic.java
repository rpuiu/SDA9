package com.sda.sda9.inheritance.teststatic;

import com.sda.sda9.inheritance.Car;
import com.sda.sda9.inheritance.Vehicle;

public class MainTestStatic {

        private  int x = 5;
        private static int y = 6;

        private final int z = 11;
        private static final Vehicle car = new Vehicle(1);

    public static void main(String[] args) {
        System.out.println(Animal.NUMBER_OF_EYES);
        System.out.println(Animal.CAR.maxSpeed());

        MainTestStatic mts = new MainTestStatic();
        mts.x = 10; //non-static variable, an instance must be used.
        y = 11; //static variable

        //z = 20; we cannot modify a final primitive's value
//        car = new Vehicle(000); we cannot modify a final variable reference;
        System.out.println(car.getNoOfWheels());
        car.setNoOfWheels(11111);  //we can change the values inside a final object. We cannot modify his reference
        System.out.println(car.getNoOfWheels());

        System.out.println( Animal.getColor());

        Animal a = new Animal();
        Car numberOfEyes = a.CAR;
        System.out.println(numberOfEyes);

    }
}
