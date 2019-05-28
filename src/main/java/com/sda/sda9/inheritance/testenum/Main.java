package com.sda.sda9.inheritance.testenum;

public class Main {

    public static void main(String[] args) {
        TrafficLight t = TrafficLight.ORANGE;
        System.out.println(t.getMessage());
        System.out.println(t.getTimeToWait());
        t.modifyTimeToWait(1000);
        System.out.println(t.getTimeToWait());

        for(TrafficLight x : TrafficLight.values()){

            System.out.println(TrafficLight.valueOf("GREEN"));
//            System.out.println(x.getMessage());
        }

//        switchSemaphore(t);
//        switchSemaphore(TrafficLight.RED);
//        switchSemaphoreString("RED");

    }

    static void switchSemaphore(TrafficLight trafficLight) {
        switch (trafficLight) {
            case RED:
                System.out.println("STOP!");
                break;
            case GREEN:
                System.out.println("WALK");
                break;
            case ORANGE:
                System.out.println("RUN!");
                break;
            default:
                System.out.println("WAIT");
        }
    }
    static void switchSemaphoreString(String trafficLight) {
        switch (trafficLight) {
            case "RED":
                System.out.println("STOP!");
                break;
            case "GREEN":
                System.out.println("WALK");
                break;
            case "ORANGE":
                System.out.println("RUN!");
                break;
            default:
                System.out.println("WAIT");
        }
    }
}
