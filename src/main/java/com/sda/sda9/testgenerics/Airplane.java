package com.sda.sda9.testgenerics;

public class Airplane implements  Comparable<Airplane>{

    int maxSpeed;

    public Airplane(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "AIRPLANE";
    }


    @Override
    public int compareTo(Airplane o) {

        return this.maxSpeed - o.maxSpeed;
    }
}
