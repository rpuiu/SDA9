package com.sda.sda9.testgenerics;

public class Main {
    public static void main(String[] args) {
//        Ball b = new Ball();
//        Box<Ball> box = new Box(b);
//
//        Ball newBall= box.getItem();
//
        Airplane airplane = new Airplane(100);
        Airplane airplane2 = new Airplane(500);

        if(airplane.compareTo(airplane2) > 0){
            // airplane > airplane2
        }

        if(airplane.compareTo(airplane2) == 0){
           // airplane = airplane2;
        }
        if(airplane.compareTo(airplane2) < 0){
           // airplane < airplane2;
        }
//        Box<Airplane> airplaneBox = new Box(b);
//        Airplane airplane1 = airplaneBox.getItem();
//        System.out.println(airplane1);

//        System.out.println(newBall);
    }
}
