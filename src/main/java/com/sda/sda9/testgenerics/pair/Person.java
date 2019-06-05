package com.sda.sda9.testgenerics.pair;

public class Person {

     String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static String addToName(Person name){
        return "toto" + " " + name.getName();
    }

}
