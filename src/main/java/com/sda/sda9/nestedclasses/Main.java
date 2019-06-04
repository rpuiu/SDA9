package com.sda.sda9.nestedclasses;

import com.sda.sda9.inheritance.geometry.Shape;

public class Main {

    public static void main(String[] args) {
        Car c = new Car(200);

        System.out.println(c.getMaxSpeed());

        Car.Wheel wheel = c.new Wheel();
        wheel.flatTire();

        Car.Wheel otherWheel = new Car(400).new Wheel();
        otherWheel.flatTire();

        System.out.println(c.getMaxSpeed());

        RaceCar r = new RaceCar(1000);

        System.out.println(r.getMaxSpeed());
        r.something();
        System.out.println(r.getMaxSpeed());


        Garage.Mechanic mechanic = new Garage.Mechanic();
        mechanic.print();

        Garage garage = new Garage();
        garage.print();

        Shape myClass = new Shape(){  //Anonymous inner class;

            @Override
            public String getNane() {
                return "ShapeName";
            }

            @Override
            public int getNrOfEdges() {
                return 10000;
            }
            @Override
            public void calculateArea(){
                System.out.println( "Anonymous area");
            }
        };

        myClass.calculateArea();

    }
}
