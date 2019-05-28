package com.sda.sda9.testenum;

public enum TrafficLight {

    RED("STOP!!!" , 30),
    GREEN("GO", 30),
    ORANGE("RUN!!!!", 5);
    private String message;


    public int getTimeToWait() {
        return timeToWait;
    }

    private int timeToWait;

    TrafficLight(String message, int timeToWait){
        this.timeToWait = timeToWait;
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void modifyTimeToWait(int time){
        this.timeToWait = time;
    }
}
